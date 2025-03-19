package com.example.LibraryManagementSys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class LibraryManagementSysApplication {

	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(LibraryManagementSysApplication.class, args);
		
		Book book=context.getBean(Book.class);
		book.BoookInfo();
		book.BookName();
	}

}
