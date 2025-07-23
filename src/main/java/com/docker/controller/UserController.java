package com.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.docker.entity.User;
import com.docker.repo.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	private User createUser(@RequestBody User user)
	{
		User user1=User.builder().id(user.getId()).name(user.getName()).build();
		repository.save(user1);
		return user1;
	}
	
	@GetMapping("/get/{id}")
	public List<User> getAllUsers(@PathVariable int id)
	{
		return repository.findAll();
	}
}
