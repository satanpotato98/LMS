package com.lms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.entites.Messages;

@Repository
public interface MessagesRepo extends JpaRepository<Messages,Integer> {

}
