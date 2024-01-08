package com.example.TestProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
	try( var context = new AnnotationConfigApplicationContext(AppConfiguration.class)){
		System.out.println(context.getBean("name"));
	}


		//SpringApplication.run(TestProjectApplication.class, args);
	}

}
