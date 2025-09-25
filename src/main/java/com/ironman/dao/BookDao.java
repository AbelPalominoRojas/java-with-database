package com.ironman.dao;

import com.ironman.entity.Book;

import java.util.List;

public interface BookDao {
    List<Book> findAll() throws Exception;
}
