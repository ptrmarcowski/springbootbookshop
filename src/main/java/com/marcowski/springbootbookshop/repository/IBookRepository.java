package com.marcowski.springbootbookshop.repository;

import com.marcowski.springbootbookshop.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {

}
