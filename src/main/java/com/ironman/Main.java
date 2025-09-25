package com.ironman;


import com.ironman.dao.BookDao;
import com.ironman.dao.PublisherDao;
import com.ironman.dao.impl.BookDaoImpl;
import com.ironman.dao.impl.PublisherDaoImpl;
import com.ironman.entity.Book;
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
            System.out.println("Publishers:");
            System.out.println("---------------------------");
            for (Publisher publisher : publishers) {
                System.out.println("ID: " + publisher.getId());
                System.out.println("Code: " + publisher.getPublisherCode());
                System.out.println("Name: " + publisher.getPublisherName());
                System.out.println("Created At: " + publisher.getCreatedAt());
                System.out.println("Status: " + publisher.getStatus());
                System.out.println("---------------------------");
            }

            System.out.println("End of publishers list.");

            BookDao bookDao = new BookDaoImpl();
            List<Book> books = bookDao.findAll();
            System.out.println("Books:");
            System.out.println("---------------------------");
            for (Book book : books) {
                System.out.println("ID: " + book.getId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthors());
                System.out.println("Publisher ID: " + book.getPublisherId());
                System.out.println("Published Year: " + book.getPublicationYear());
                System.out.println("Status: " + book.getStatus());
                System.out.println("---------------------------");
            }
            System.out.println("End of books list.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}