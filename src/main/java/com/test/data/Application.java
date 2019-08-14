package com.test.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by guanguan on 2017/7/20.
 */
@SpringBootApplication
@ComponentScan("com.test.data")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

     }



}
