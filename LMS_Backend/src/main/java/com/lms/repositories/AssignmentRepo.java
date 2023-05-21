package com.lms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.entites.Assignment;

@Repository
public interface AssignmentRepo extends JpaRepository<Assignment,Integer> {

}
