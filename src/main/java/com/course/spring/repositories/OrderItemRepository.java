package com.course.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.spring.entities.OrderItem;
import com.course.spring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
