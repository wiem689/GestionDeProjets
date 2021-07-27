package tn.gestion.projets.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.gestion.projets.spring.entity.Traitement;

@Repository
public interface TraitementRepository extends CrudRepository<Traitement,Long>{

}
