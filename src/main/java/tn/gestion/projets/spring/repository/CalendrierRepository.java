package tn.gestion.projets.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.gestion.projets.spring.entity.Calendrier;



@Repository
public interface CalendrierRepository extends CrudRepository<Calendrier,Long> {

}

