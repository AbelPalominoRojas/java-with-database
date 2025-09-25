package com.ironman.dao.impl;

import com.ironman.dao.PublisherDao;
import com.ironman.dao.core.ConnectionCore;
import com.ironman.entity.Publisher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class PublisherDaoImpl extends ConnectionCore implements PublisherDao {

    @Override
    public List<Publisher> findAll() throws Exception {
        // Attributes
        List<Publisher> publishers = new ArrayList<>();
        String sqlQuery ;

        // process
        sqlQuery = "SELECT id, publisher_code, publisher_name, created_at, status FROM publishers";

        try (
                // Connection
                Connection connection = getConnection();

                // PreparedStatement
                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

                // ResultSet
                ResultSet resultSet = preparedStatement.executeQuery();
                ) {

            // process resultSet
            Publisher publisher;

            while (resultSet.next()) {
                publisher = new Publisher();
                publisher.setId(resultSet.getInt("id"));
                publisher.setPublisherCode(resultSet.getString("publisher_code"));
                publisher.setPublisherName(resultSet.getString("publisher_name"));

                Timestamp createdAt = resultSet.getTimestamp("created_at");
                if (createdAt != null) {
                    publisher.setCreatedAt(createdAt.toLocalDateTime());
                }

                publisher.setStatus(resultSet.getInt("status"));

                publishers.add(publisher);
            }

        }

        // result
        return publishers;
    }
}
