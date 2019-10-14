package com.wildcodeschool.myLibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wildcodeschool.myLibrary.controllers.App;

@SpringBootApplication
public class QueteSpringIoCdiApplication {
	public static void main(String[] args) {
		SpringApplication.run(QueteSpringIoCdiApplication.class, args);
		App myApp = new App();
		myApp.start();
	}

}
