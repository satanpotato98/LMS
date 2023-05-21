package com.lms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.entites.Classes;

@Repository
public interface ClassesRepo extends JpaRepository<Classes,Integer> {

}
