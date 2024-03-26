package com.examplou.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplou.course.entities.Order;
import com.examplou.course.repositories.OrderRepository;

@Service
public class OrderSevice {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> fibdAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
