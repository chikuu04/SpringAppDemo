package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //defines class is controller , which provides the https request for the application
public class HelloController {
	
	@RequestMapping("/hello")  //this annotation takes an argument to map to a particular url when called  
								// request mapping is only for get request , for other type of request we need to specify the request.
	public String sayHi() {
		return "Hi";
	}
}
