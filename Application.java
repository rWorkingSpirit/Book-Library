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
					// Code to delete the file containing all books
					new DeleteFile().Delete();
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
		try 
		{
			new ReadFile().Read();
		} 
		catch (IOException e)
		{
			System.out.println("Cannot find the file you are looking for.");
			System.out.println("Does the file exist?");
		}

		System.out.println(); // To keep the text clearer in the console.
	}
	
	
}
