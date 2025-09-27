package com.ironman;


import com.ironman.dto.PublisherResponse;
import com.ironman.service.PublisherService;
import com.ironman.service.impl.PublisherServiceFunctionalImpl;
import com.ironman.service.impl.PublisherServiceImpl;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Main main = new Main();

        try {
            PublisherService publisherService = new PublisherServiceFunctionalImpl();
            List<PublisherResponse> publishers = publisherService.findAll();
            System.out.println("Publishers:");
            System.out.println("---------------------------");
            for (PublisherResponse publisher : publishers) {
                System.out.println("ID: " + publisher.getId());
                System.out.println("Code: " + publisher.getPublisherCode());
                System.out.println("Name: " + publisher.getPublisherName());
                System.out.println("---------------------------");
            }

            System.out.println("End of publishers list.");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}