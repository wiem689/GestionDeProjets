package tn.gestion.projets.spring.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}
	
	@GetMapping("/chefdeprojet")
	@PreAuthorize("hasRole('CHEFDEPROJET') or hasRole('ADMIN') or hasRole('SUPERADMIN') or hasRole('MEMBREITHENTIFIE') ")
	public String chefdeprojetAccess() {
		return "Chefdeprojet Content.";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Admin Board.";
	}

	@GetMapping("/superadmin")
	@PreAuthorize("hasRole('SUPERADMIN')")
	public String superadminAccess() {
		return "Superadmin Board.";
	}
	
	@GetMapping("/membreithentifie")
	@PreAuthorize("hasRole('MEMBREITHENTIFIE')")
	public String membreithentifieAccess() {
		return "Membreithentifie Board.";
	}
}