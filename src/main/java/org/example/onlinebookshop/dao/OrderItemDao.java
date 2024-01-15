package org.example.onlinebookshop.dao;

import org.example.onlinebookshop.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemDao extends JpaRepository<OrderItem,Integer> {
}
