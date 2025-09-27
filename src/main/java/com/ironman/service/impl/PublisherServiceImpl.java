package com.ironman.service.impl;

import com.ironman.dao.PublisherDao;
import com.ironman.dao.impl.PublisherDaoImpl;
import com.ironman.dto.PublisherRequest;
import com.ironman.dto.PublisherResponse;
import com.ironman.entity.Publisher;
import com.ironman.mapper.PublisherMapper;
import com.ironman.mapper.impl.PublisherMapperImpl;
import com.ironman.service.PublisherService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PublisherServiceImpl implements PublisherService {
    private PublisherDao publisherDao;
    private PublisherMapper publisherMapper;

    public PublisherServiceImpl() {
        this.publisherDao = new PublisherDaoImpl();
        this.publisherMapper = new PublisherMapperImpl();
    }

    @Override
    public List<PublisherResponse> findAll() throws Exception {
        List<PublisherResponse> publisherResponseList = new ArrayList<>();
        List<Publisher> publishers = publisherDao.findAll();

        for (Publisher publisher : publishers) {
            PublisherResponse publisherResponse = publisherMapper.toResponse(publisher);
            publisherResponseList.add(publisherResponse);
        }


        return publisherResponseList;
    }

    @Override
    public PublisherResponse create(PublisherRequest publisherRequest) throws Exception {

        Publisher publisher = publisherMapper.toEntity(publisherRequest);
        publisher.setCreatedAt(LocalDateTime.now());
        publisher.setStatus(1);

        Publisher savedPublisher = publisherDao.create(publisher);

        return publisherMapper.toResponse(savedPublisher);
    }
}
