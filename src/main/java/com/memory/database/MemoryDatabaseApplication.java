package com.memory.database;

import com.memory.database.model.Person;
import com.memory.database.repository.IPersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MemoryDatabaseApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(MemoryDatabaseApplication.class, args);

		IPersonRepository personRepository = configurableApplicationContext.getBean(IPersonRepository.class);

		Person person = new Person("Beltrano", "Marcondes", 29);
		personRepository.save(person);

	}

}
