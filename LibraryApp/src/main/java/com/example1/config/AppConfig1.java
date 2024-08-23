package com.example1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example1.library.Address;
import com.example1.library.Library;

@Configuration
public class AppConfig1 {
	
	@Bean
	public Address address() {
        return new Address("5-43-Ad  main road", "Gachibowli-Hyederabad");
    }
	
	@Bean
	public Library library() {
        return new Library(address());
    }

}
