package com.ironman.service.impl;

import com.ironman.dao.PublisherDao;
import com.ironman.dao.impl.PublisherDaoImpl;
import com.ironman.dto.PublisherRequest;
import com.ironman.dto.PublisherResponse;
import com.ironman.mapper.PublisherMapper;
import com.ironman.mapper.impl.PublisherMapperImpl;
import com.ironman.service.PublisherService;

import java.util.List;

public class PublisherServiceFunctionalImpl implements PublisherService {
    private PublisherDao publisherDao;
    private PublisherMapper publisherMapper;

    public PublisherServiceFunctionalImpl() {
        this.publisherDao = new PublisherDaoImpl();
        this.publisherMapper = new PublisherMapperImpl();
    }

    @Override
    public List<PublisherResponse> findAll() throws Exception {
        return publisherDao.findAll()
                .stream()
                .map(publisherMapper::toResponse)
                .toList();
    }

    @Override
    public PublisherResponse create(PublisherRequest publisherRequest) throws Exception {
        return null;
    }
}
