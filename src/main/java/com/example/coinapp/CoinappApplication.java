package com.example.coinapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.coinapp.*"})
public class CoinappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinappApplication.class, args);
	}

}
