package tn.gestion.projets.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.gestion.projets.spring.entity.Chat;

public interface ChatRepository extends CrudRepository<Chat, Long> {

}
