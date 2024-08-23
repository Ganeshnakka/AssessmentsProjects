package com.example0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example1.config.AppConfig1;
import com.example1.library.Library;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext
				                                                (AppConfig1.class);
		
		Library library = context.getBean(Library.class);
        library.showAddress();

	}

}
