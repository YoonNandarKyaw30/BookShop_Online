package org.example.onlinebookshop.dao;

import org.example.onlinebookshop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order,Integer> {
}
