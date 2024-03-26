package com.examplou.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplou.course.entities.Category;
import com.examplou.course.repositories.CategoryRepository;

@Service
public class CategorySevice {

	@Autowired
	private CategoryRepository repository;

	public List<Category> fibdAll() {
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
