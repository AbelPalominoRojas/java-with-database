package com.ironman.dao.impl;

import com.ironman.dao.BookDao;
import com.ironman.dao.core.ConnectionCore;
import com.ironman.entity.Book;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl extends ConnectionCore implements BookDao {
    @Override
    public List<Book> findAll() throws Exception {
        // Attributes
        List<Book> books = new ArrayList<>();
        String sqlQuery ;

        // process
        sqlQuery = "select id, isbn, title, authors, edition, publication_year, publisher_id, created_at, status from books";

        try (
            // Connection
           var connection = getConnection();

            // PreparedStatement
              var preparedStatement = connection.prepareStatement(sqlQuery);

            // ResultSet
                var resultSet = preparedStatement.executeQuery();
        ) {
            // process resultSet
            Book book;

            while (resultSet.next()) {
                var createdAtDB = resultSet.getTimestamp("created_at");
                LocalDateTime createdAt = null;
                if (createdAtDB != null) {
                    createdAt = createdAtDB.toLocalDateTime();
                }

                book = Book.builder()
                        .id(resultSet.getInt("id"))
                        .isbn(resultSet.getString("isbn"))
                        .title(resultSet.getString("title"))
                        .authors(resultSet.getString("authors"))
                        .edition(resultSet.getString("edition"))
                        .publicationYear(resultSet.getInt("publication_year"))
                        .publisherId(resultSet.getInt("publisher_id"))
                        .createdAt(createdAt)
                        .status(resultSet.getInt("status"))
                        .build();

                books.add(book);
            }

        }

        // result
        return books;
    }

    @Override
    public Book findById(Integer integer) throws Exception {
        return null;
    }

    @Override
    public List<Book> findByPublicationYear(Integer publicationYear) throws Exception {
        return List.of();
    }
}
