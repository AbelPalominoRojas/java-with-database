package com.ironman.dao;

import com.ironman.entity.Publisher;

import java.util.List;

public interface PublisherDao {
    List<Publisher> findAll() throws Exception;
}
