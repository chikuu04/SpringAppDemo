package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //tells the class that it is a spring application
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class,args); //calling a static method and passing the class to run it and (args) just for a pass through.	
	}
}
