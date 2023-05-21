package com.lms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.entites.Submission;

@Repository
public interface SubmissionRepo extends JpaRepository<Submission,Integer>{

}
