package com.test.springoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.springoot.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

