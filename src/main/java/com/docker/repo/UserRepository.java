package com.docker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
