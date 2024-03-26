package com.examplou.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplou.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
