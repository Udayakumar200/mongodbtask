package com.mndbempl.empl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EmplApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmplApplication.class, args);
	}

}
