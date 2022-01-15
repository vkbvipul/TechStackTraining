package com.techstacktraining.Greeting;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	@Autowired
	private GreetingRepository greetingRepos;
	
	public ArrayList<Greetings> greetingRepo = new ArrayList<Greetings>();
	
	public void addMessage(Greetings greeting) {
		//greetingRepo.add(new Greetings(id,name));
		greetingRepos.save(greeting);
	}

	public Greetings getMessage(String name) {
		//return greetingRepo.stream().filter(t -> t.getName().equalsIgnoreCase(name)).findFirst().get();
		return greetingRepos.findByName(name);
	}

	//public String updateGreetings(Greetings record, String oldName) {
	public void updateGreetings(Greetings record) {
		/*Greetings toUpdate = 
				greetingRepo.stream().filter(t -> t.getName().equalsIgnoreCase(oldName)).findAny().get();
		toUpdate.setName(record.getName());
		toUpdate.setMessage(record.getName());
		return oldName + " got updated to " + toUpdate.getName();*/
		greetingRepos.save(record);
	}

	public List<Greetings> getAllGreetings() {
		//return greetingRepos;
		return greetingRepos.findAll();
	}

	public void deleteName(String name) {
		//greetingRepo.removeIf(t -> t.getName().equalsIgnoreCase(name));
		//long idToDelete = greetingRepos.findByName(name).getId();
		greetingRepos.deleteById(greetingRepos.findByName(name).getId());
	}	
	
}
