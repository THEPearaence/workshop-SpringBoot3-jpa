package com.examplou.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplou.course.entities.Product;
import com.examplou.course.repositories.ProductRepository;

@Service
public class ProductSevice {

	@Autowired
	private ProductRepository repository;

	public List<Product> fibdAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
