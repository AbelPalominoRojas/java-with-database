package com.ironman;


import com.ironman.dao.PublisherDao;
import com.ironman.dao.impl.PublisherDaoImpl;
import com.ironman.entity.Publisher;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Main main = new Main();

        try {
            PublisherDao publisherDao = new PublisherDaoImpl();
            List<Publisher> publishers = publisherDao.findAll();
            for (Publisher publisher : publishers) {
                System.out.println("ID: " + publisher.getId());
                System.out.println("Code: " + publisher.getPublisherCode());
                System.out.println("Name: " + publisher.getPublisherName());
                System.out.println("Created At: " + publisher.getCreatedAt());
                System.out.println("Status: " + publisher.getStatus());
                System.out.println("---------------------------");
            }

            System.out.println("Starting ...");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}