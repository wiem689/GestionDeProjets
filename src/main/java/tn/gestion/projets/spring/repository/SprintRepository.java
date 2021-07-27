package tn.gestion.projets.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.gestion.projets.spring.entity.Sprint;


@Repository
public interface SprintRepository extends CrudRepository<Sprint,Long> {

}
