package com.ibm.newsletter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ibm.newsletter.service.RecognitionService;

@SpringBootApplication
public class Application{
	
	@Autowired
	RecognitionService recognitionService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

