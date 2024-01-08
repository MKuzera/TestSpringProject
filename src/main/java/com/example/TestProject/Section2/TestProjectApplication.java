package com.example.TestProject.Section2;

import com.example.TestProject.Section2.Game.GameRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class TestProjectApplication {
	@Bean
	public String name(){
		return "co";
	}

	public static void main(String[] args) {
	try( var context = new AnnotationConfigApplicationContext(TestProjectApplication.class)){
		System.out.println(context.getBean("name"));
		context.getBean(GameRunner.class).run();
	}


		//SpringApplication.run(TestProjectApplication.class, args);
	}

}
