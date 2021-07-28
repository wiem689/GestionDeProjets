package tn.gestion.projets.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.gestion.projets.spring.entity.Email;

public interface EmailRepository extends CrudRepository<Email, Long> {

}
