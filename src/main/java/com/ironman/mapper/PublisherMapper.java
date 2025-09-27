package com.ironman.mapper;

import com.ironman.dto.PublisherRequest;
import com.ironman.dto.PublisherResponse;
import com.ironman.entity.Publisher;

public interface PublisherMapper {

    PublisherResponse toResponse(Publisher publisher);

    Publisher toEntity(PublisherRequest publisherRequest);
}
