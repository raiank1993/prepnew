package com.thinkandcode.prepnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class PrepnewApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrepnewApplication.class, args);
	}

}
