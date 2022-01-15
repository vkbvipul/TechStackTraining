package com.techstacktraining.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//Say simple Hello World
	@GetMapping(value = {"","/","/hello"})
	public String simpleHelloWorld()
	{
		return "Hello World !";
	}
	
	//Say Hello with Name as Query Parameter.
	@GetMapping(value = "/hello/ReqParam")
	public String queryHelloName(@RequestParam(value = "name") String name)
	{
		return "Hello " + name + " !!!";
	}
	
	
	//Say Hello with Name in Path Variable
	@GetMapping(value = "/hello/{name}")
	public String pathVariableName(@PathVariable String name)
	{
		return "Hello " + name + " !!!!";
	}
	
	//Say Hello with Name in the Body
	@PutMapping(value = "/hello/body")
	public String helloInBody(@RequestBody Name n)
	{
		return "Hello " +  n.getFirstName() + " !!!";
	}
	
}
