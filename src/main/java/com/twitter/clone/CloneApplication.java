package com.twitter.clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.twitter.clone.Database;

@SpringBootApplication
public class CloneApplication {

	public static void main(String[] args) {
		Database.LoadFiles();
		SpringApplication.run(CloneApplication.class, args);
	}

}
