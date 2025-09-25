package com.ironman.dao.core;

import java.util.List;

public interface CrudDao <T, ID> {
    List<T> findAll() throws Exception;
    T findById(ID id) throws Exception;
}
