package com.lay.poc.poccucumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lay.poc.weekdays"})
public class PocCucumberApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocCucumberApplication.class, args);
	}

}
