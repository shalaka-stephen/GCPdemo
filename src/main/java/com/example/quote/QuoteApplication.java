package com.example.quote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication (exclude={DataSourceAutoConfiguration.class})

public class QuoteApplication {
	public static void main(String[] args) {
		SpringApplication.run(QuoteApplication.class, args);
	}

}