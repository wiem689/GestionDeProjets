package tn.gestion.projets.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.gestion.projets.spring.entity.Conversation;

public interface ConversationRepository extends CrudRepository<Conversation, Long> {

}
