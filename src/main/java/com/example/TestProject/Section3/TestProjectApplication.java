package com.example.TestProject.Section3;

import com.example.TestProject.Section3.GameLogic.DependenciesInjectionExample;
import com.example.TestProject.Section3.GameLogic.GameRunner;
import com.example.TestProject.Section3.BusinessCalculationService.BusinnesCalculationService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan("com.example.TestProject.Section3.BusinessCalculationService")
@SpringBootApplication
public class TestProjectApplication {
	@Bean
	public String name(){
		return "co";
	}



	public static void main(String[] args) {
	try( var context = new AnnotationConfigApplicationContext(TestProjectApplication.class)){
	//	System.out.println(context.getBean("name"));
	//	context.getBean(GameRunner.class).run();
	//	System.out.println(context.getBean(DependenciesInjectionExample.class).toString());
		System.out.println(context.getBean(BusinnesCalculationService.class).findMax());
	}


		//SpringApplication.run(TestProjectApplication.class, args);
	}

}
