import ioclasses.*;

import java.io.IOException;
import java.util.ArrayList;
import book.*;

public class Application 
{
	ArrayList<Book> books = new ArrayList<Book>();
	String[] bookInformation;

	
	private int menuNumber;
	
	
	public void start()
	{
//		DO NOT OVERRIDE OR DELETE THE TEXT BELOW!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		====================================================================================
		
		// Need a class called StartMenu.
		// With a method called Menu()
		// 1. To input a new Book
		// 2. To view all books in the library
		// 3. Delete a book from the library
		
		
//		Application -> StartMenu
//		Application <-(int) StartMenu
//
//		Application 
//			switch
//			switch -> InsertBookInformation
//			switch -> view all book information
//			switch -> deletes book
//
//		Application <- (Book info) InsertBookInformation
//
//		Application -> FillBook
//		Application <- (Book Object)FillBook
		
//		Application stores the Book object in a ArrayList
		
		
		
//		====================================================================================
		do
		{
			Menu.displayMenu();
			menuNumber = Menu.getChoice();
			
			System.out.println(); // To keep the text clearer in the console.
			
			switch(menuNumber)
			{
				case 1:
					// Code to insert book information
					InsertBookInformation iBI = new InsertBookInformation();
					iBI.askForInformation();
					bookInformation = iBI.getInformation();
					
					// Creates the book & adds to books ArrayList
					CreateBook createBook = new CreateBook();
					books.add(createBook.fillBook(bookInformation));
					
					// Save all books to a file.
					try
					{
						new CreateFile(books);
					}
					catch (IOException e) 
					{
						e.printStackTrace();
						System.out.println("Something went wrong when trying to create a file!");
					}
					break;
				case 2:
					// Code to view all book information
					ShowAllBooks();
					break;
				case 3:
					// Code to delete a given book from the library
					break;
				case 0:
					System.out.println("Exiting the program.");
					System.exit(0);
					break;
			}
		}
		while(menuNumber != 0);
		
		
		
	}
	
	
	private void ShowAllBooks()
	{
		for(Book b: books)
		{
			System.out.println("Title: " + b.getTitle());
		}
		
		System.out.println(); // To keep the text clearer in the console.
	}
	
	
}
