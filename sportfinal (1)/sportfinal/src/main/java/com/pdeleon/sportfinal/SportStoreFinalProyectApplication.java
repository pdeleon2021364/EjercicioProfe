package com.pdeleon.sportfinal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SportStoreFinalProyectApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SportStoreFinalProyectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Api Funca");
    }
}
