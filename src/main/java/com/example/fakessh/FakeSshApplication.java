package com.example.fakessh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class FakeSshApplication {

    public static void main(String[] args) {
        SpringApplication.run(FakeSshApplication.class, args);
    }

}
