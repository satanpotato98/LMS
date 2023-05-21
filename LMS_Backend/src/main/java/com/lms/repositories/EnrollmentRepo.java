package com.lms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.entites.Enrollment;

@Repository
public interface EnrollmentRepo extends JpaRepository<Enrollment,Integer>{

}
