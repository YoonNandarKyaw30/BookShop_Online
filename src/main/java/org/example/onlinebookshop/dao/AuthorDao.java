package org.example.onlinebookshop.dao;

import org.example.onlinebookshop.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDao extends JpaRepository<Author, Integer> {
}
