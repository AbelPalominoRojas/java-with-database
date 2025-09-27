package com.ironman.dto;

import lombok.*;

// Lombok Annotations
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PublisherResponse {
    private Integer id;
    private String publisherCode;
    private String publisherName;
}
