package tn.gestion.projets.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.gestion.projets.spring.entity.Claim;

public interface ClaimRepository extends CrudRepository<Claim, Long> {

}
