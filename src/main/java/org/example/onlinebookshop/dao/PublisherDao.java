package org.example.onlinebookshop.dao;

import org.example.onlinebookshop.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherDao extends JpaRepository<Publisher,Integer> {
}
