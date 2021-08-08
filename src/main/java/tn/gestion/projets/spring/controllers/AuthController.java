package tn.gestion.projets.spring.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.gestion.projets.spring.entity.ERole;
import tn.gestion.projets.spring.entity.Role;
import tn.gestion.projets.spring.entity.User;
import tn.gestion.projets.spring.repository.RoleRepository;
import tn.gestion.projets.spring.repository.UserRepository;
import tn.gestion.projets.spring.request.LoginRequest;
import tn.gestion.projets.spring.request.SignupRequest;
import tn.gestion.projets.spring.response.JwtResponse;
import tn.gestion.projets.spring.response.MessageResponse;
import tn.gestion.projets.spring.security.jwt.JwtUtils;
import tn.gestion.projets.spring.security.services.UserDetailsImpl;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	JwtUtils jwtUtils;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);
		
		
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();		
		List<String> roles = userDetails.getAuthorities().stream()
				.map(item -> item.getAuthority())
				.collect(Collectors.toList());

		return ResponseEntity.ok(new JwtResponse(jwt, 
												 userDetails.getId(), 
												 userDetails.getUsername(), 
												 userDetails.getEmail(), 
												 roles));
	}

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
		if (userRepository.existsByUsername(signUpRequest.getUsername())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: Username is already taken!"));
		}
         
		if (userRepository.existsByEmail(signUpRequest.getEmail())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: Email is already in use!"));
		}

		// Create new user's account
		User user = new User(signUpRequest.getUsername(), 
							 signUpRequest.getEmail(),
							 encoder.encode(signUpRequest.getPassword()));

		Set<String> strRoles = signUpRequest.getRole();
		Set<Role> roles = new HashSet<>();

		if (strRoles == null) {
			Role chefdeprojetRole = roleRepository.findByName(ERole.ROLE_CHEFDEPROJET)
					.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
			roles.add(chefdeprojetRole);
		} else {
			strRoles.forEach(role -> {
				switch (role) {
				case "admin":
					Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(adminRole);

					break;
				case "superadmin":
					Role superadminRole = roleRepository.findByName(ERole.ROLE_SUPERADMIN)
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(superadminRole);

					break;
				case "membreithentifie":
					Role membreithentifieRole = roleRepository.findByName(ERole.ROLE_MEMBREITHENTIFIE)
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(membreithentifieRole);

					break;
				default:
					Role chefdeprojetRole = roleRepository.findByName(ERole.ROLE_CHEFDEPROJET)
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(chefdeprojetRole);
				}
			});
		}

		user.setRoles(roles);
		userRepository.save(user);

		return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
	}
}