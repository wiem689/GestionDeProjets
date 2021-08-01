package tn.gestion.projets.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.gestion.projets.spring.entity.Jeux;


@Repository
public interface JeuxRepository extends CrudRepository<Jeux,Long> {

}
