package com.bdqn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbox-consumer.xml"})
public class SourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SourceApplication.class, args);
    }
}
