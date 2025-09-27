package com.ironman.service;

import com.ironman.dto.PublisherRequest;
import com.ironman.dto.PublisherResponse;

import java.util.List;

public interface PublisherService {
    List<PublisherResponse> findAll() throws Exception;
    PublisherResponse create(PublisherRequest publisherRequest) throws  Exception;
}
