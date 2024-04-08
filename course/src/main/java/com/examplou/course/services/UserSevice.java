package com.examplou.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplou.course.entities.User;
import com.examplou.course.repositories.UserRepository;

@Service
public class UserSevice {

	@Autowired
	private UserRepository repository;
	
	public List<User> fibdAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}
