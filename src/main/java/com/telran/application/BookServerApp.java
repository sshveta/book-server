package com.telran.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.weblogic.foo.Bar;

@SpringBootApplication
public class BookServerApp {
    public static void main(String[] args) {
        SpringApplication.run(BookServerApp.class, args);

    }
}
