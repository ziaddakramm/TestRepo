package com.sumerge.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class GitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitApplication.class, args);
	}

}
