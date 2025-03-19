package com.example.LibraryManagementSys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book {
	
	Author author;
	
	@Autowired
	public Book(Author author)
	{
		this.author=author;
	}
	
void BoookInfo()
	{
		author.write();
		System.out.println("Book Reading Started");
	}
void BookName()
{
	
	System.out.println("Agnipankha");
}
	
	
	
	

}
