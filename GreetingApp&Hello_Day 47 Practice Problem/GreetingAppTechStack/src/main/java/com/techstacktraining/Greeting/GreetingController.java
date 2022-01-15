package com.techstacktraining.Greeting;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Autowired
	private GreetingService greetService;
	private final AtomicInteger count = new AtomicInteger();
	
	@RequestMapping("/name/{name}")
	public Greetings sendGreetings(@PathVariable String name)
	{
		//greetService.addMessage(count.incrementAndGet(),name);
		greetService.addMessage(new Greetings(count.incrementAndGet(), name));
		return greetService.getMessage(name);
	}
	
	@RequestMapping("/name")
	public List<Greetings> displayGreetings()
	{
		return greetService.getAllGreetings();
	}
	
	@PutMapping("/name")
	public void changeName(@RequestBody Greetings record)
	{
		//return greetService.updateGreetings(record,oldName);
		greetService.updateGreetings(record);
	}
	
	@DeleteMapping("/name/{name}")
	public void deleteName(@PathVariable String name)
	{
		greetService.deleteName(name);
	}
	
}
