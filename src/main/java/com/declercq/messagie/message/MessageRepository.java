package com.declercq.messagie.message;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    Optional<Message> getMessageById(long id);

    List<Message> findFirst10ByOrderByIdDesc();



}
