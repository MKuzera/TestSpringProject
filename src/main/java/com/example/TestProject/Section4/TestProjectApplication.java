package com.example.TestProject.Section4;

import com.example.TestProject.Section2.Game.GameRunner;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class TestProjectApplication {
	// new instance
	@Component
	@Scope("prototype")
	class PrototypeClass{

	}
    // every time the same instance
	@Component
	class NomralClass{

		public void print() {
			System.out.println("Print");
		}
	}


	@Component
	class PosrPreClass{
		private NomralClass nomralClass;

		PosrPreClass(NomralClass nomralClass){
			this.nomralClass = nomralClass;
		}

		@PostConstruct
		public void doSth(){
			nomralClass.print();
		}
		@PreDestroy
		public void cleanUp(){
			System.out.println("Clean");
		}



	}



	public static void main(String[] args) {
	try( var context = new AnnotationConfigApplicationContext(TestProjectApplication.class)){
		System.out.println(	context.getBean(PrototypeClass.class));
		System.out.println(	context.getBean(PrototypeClass.class));
		System.out.println(	context.getBean(PrototypeClass.class));

		System.out.println(	context.getBean(NomralClass.class));
		System.out.println(	context.getBean(NomralClass.class));
		System.out.println(	context.getBean(NomralClass.class));



	}


		//SpringApplication.run(TestProjectApplication.class, args);
	}

}
