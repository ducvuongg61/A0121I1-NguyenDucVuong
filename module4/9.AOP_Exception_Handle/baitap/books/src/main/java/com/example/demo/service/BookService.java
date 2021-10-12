package com.example.demo.service.Impl;

import com.example.demo.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    Book findById(int id);

    void save(Book book);

    void remove(int id);

    void borrow(Book book , int usedCode);

    boolean returnBook(Book book , int usedCode);
}
