package com.ironman.entity;

import lombok.*;

import java.time.LocalDateTime;

// Lombok Annotations
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    // Attributes
    private Integer id;
    private String isbn;
    private String title;
    private String authors;
    private String edition;
    private Integer publicationYear;
    private Integer publisherId;
    private LocalDateTime createdAt;
    private Integer status;

}
