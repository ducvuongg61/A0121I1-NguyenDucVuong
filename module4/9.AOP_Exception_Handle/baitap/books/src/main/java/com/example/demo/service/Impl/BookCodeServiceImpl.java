package com.example.demo.service.Impl;

import com.example.demo.model.BookCode;
import com.example.demo.repository.BookCodeRepo;
import com.example.demo.service.BookCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCodeImpl implements BookCodeService {
    @Autowired
    BookCodeRepo bookCodeRepo;


    @Override
    public List<BookCode> findAll() {
        return null;
    }

    @Override
    public void save(BookCode bookCode) {

    }

    @Override
    public void delete(int id) {
        bookCodeRepo.deleteById(id);
    }

    @Override
    public BookCode findById(int id) {
        return bookCodeRepo.findById(id).orElse(null);
    }

    @Override
    public List<BookCode> findBookCodeByBook_Id(int id) {
        return null;
    }

    @Override
    public List<BookCode> findAllBookCode_IdAnfStatus(int id, String status) {
        return null;
    }

    @Override
    public BookCode findByBook_IdAndCode(int id, int codeBook) {
        return null;
    }
}
