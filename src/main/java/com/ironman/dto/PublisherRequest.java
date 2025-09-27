package com.ironman.dto;

import lombok.*;

// Lombok Annotations
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PublisherRequest {
    private String publisherCode;
    private String publisherName;
}
