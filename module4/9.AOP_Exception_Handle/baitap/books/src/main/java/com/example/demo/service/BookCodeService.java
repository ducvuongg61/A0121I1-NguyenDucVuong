package com.example.demo.service.Impl;

import com.example.demo.model.BookCode;

import java.util.List;

public interface BookCodeService {
    List<BookCode> findAll();

    void save(BookCode bookCode);

    void remove(int id);

    BookCode findById(int id);

    List<BookCode> findBookCodeByBook_Id(int id);

    List<BookCode> findAllBookCode_IdAnfStatus(int id , String status);

    BookCode findByBook_IdAndCode(int id , String codeBook);
}
