import ioclasses.*;
import book.*;

public class Application 
{
//	ArrayList<Book> books = new ArrayList<Book>();
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
		
		

//		menuNumber = StartMenu;  // Calls the Menu, and stores the returned int, inside menuNumber.
		
//		====================================================================================
		
		switch(menuNumber)
		{
			case 1:
				// Code to insert book information
				InsertBookInformation iBI = new InsertBookInformation();
				iBI.askForInformation();
				bookInformation = iBI.getInformation();
				
				CreateBook createBook = new CreateBook();
//				createBook.fillBook(bookInformation);
//				books.add(getBook());
				break;
			case 2:
				// Code to view all book information
				break;
			case 3:
				// Code to delete a given book from the library
				break;
		}
		
		
	}
	
	
}
