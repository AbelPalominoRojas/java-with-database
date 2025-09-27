package com.ironman.mapper.impl;

import com.ironman.dto.PublisherRequest;
import com.ironman.dto.PublisherResponse;
import com.ironman.entity.Publisher;
import com.ironman.mapper.PublisherMapper;

public class PublisherMapperImpl implements PublisherMapper {
    @Override
    public PublisherResponse toResponse(Publisher publisher) {
        return PublisherResponse.builder()
                .id(publisher.getId())
                .publisherCode(publisher.getPublisherCode())
                .publisherName(publisher.getPublisherName())
                .build();
    }

    @Override
    public Publisher toEntity(PublisherRequest publisherRequest) {
        Publisher publisher = new Publisher();
        publisher.setPublisherCode(publisherRequest.getPublisherCode());
        publisher.setPublisherName(publisherRequest.getPublisherName());

        return publisher;
    }
}
