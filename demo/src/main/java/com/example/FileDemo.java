package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ FileStorage.class})
public class FileDemo {
	
	public static void msin(String args[]) {
		SpringApplication.run(FileStorage.class, args);
	}
}
