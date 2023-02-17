package com.ajmaltestorg.testjavaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJavaServiceApplication {

	public static void main(String[] args) {
		System.out.println("Hello World with not-so-perfect sbom  with recursive workflow!");
		SpringApplication.run(TestJavaServiceApplication.class, args);
	}

}
