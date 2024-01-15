package org.example.onlinebookshop.dao;

import org.example.onlinebookshop.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreDao extends JpaRepository<Genre,Integer> {
}
