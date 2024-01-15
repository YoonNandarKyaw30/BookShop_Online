package org.example.onlinebookshop.dao;

import org.example.onlinebookshop.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer,Integer> {
}
