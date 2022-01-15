package com.techstacktraining.Greeting;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greetings,Long>{

	public Greetings findByName(String name);
}
