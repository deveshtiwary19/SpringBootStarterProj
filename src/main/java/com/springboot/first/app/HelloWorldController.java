package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//First Hello world REST API

//@Controller //For marking the the class as controller
//@ResponseBody //For making sure that the requests return specific type (XML or JSON) 
//Instead of the above two..we have a annotation which can help us to work with both
@RestController
public class HelloWorldController {

	
	//GET REQUEST EXAMPLE
	
	//To make this method as API endpoint
	//WE can declare URI also in annotation
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	
	
}
 