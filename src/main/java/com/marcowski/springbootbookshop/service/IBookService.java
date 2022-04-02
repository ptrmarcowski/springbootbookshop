package com.marcowski.springbootbookshop.service;

import com.marcowski.springbootbookshop.model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
