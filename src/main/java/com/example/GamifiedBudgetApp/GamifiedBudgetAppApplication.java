package com.example.GamifiedBudgetApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GamifiedBudgetAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamifiedBudgetAppApplication.class, args);
	}

}
