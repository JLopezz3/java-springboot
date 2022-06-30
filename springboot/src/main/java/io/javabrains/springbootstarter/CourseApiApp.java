package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

    public static void main(String[] args) {

        // takes in the (.class, args)
        SpringApplication.run(CourseApiApp.class, args);
    }

}
