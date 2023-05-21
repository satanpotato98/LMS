package com.lms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.entites.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

}
