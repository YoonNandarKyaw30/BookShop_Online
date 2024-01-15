package org.example.onlinebookshop.dao;

import org.example.onlinebookshop.entity.Book;
import org.example.onlinebookshop.entity.BookId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, BookId> {
}
