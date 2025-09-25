package com.ironman.dao;

import com.ironman.dao.core.CrudDao;
import com.ironman.entity.Book;

import java.util.List;

public interface BookDao extends CrudDao<Book, Integer> {

    List<Book> findByPublicationYear(Integer publicationYear) throws Exception;
}
