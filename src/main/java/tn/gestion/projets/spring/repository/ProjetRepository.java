package tn.gestion.projets.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.gestion.projets.spring.entity.Projet;

@Repository
public interface ProjetRepository extends CrudRepository<Projet,Long> {

}
