package ioclasses;

import java.util.Scanner;

/***
 * Will ask the user to insert all information regarding the book
 * @author RoyRooseboom
 *
 */
public class InsertBookInformation 
{
	Scanner scanner = new Scanner(System.in);
	
	private String title;
	private String author;
	private String isbn;
	private String published;
	private String cover;
	private String category;
	
	
	public void askForInformation()
	{		
		System.out.println("Please input the information of the book,");
		System.out.println("you whish to insert into the library.");
		
		System.out.print("Title: ");
		setTitle(scanner.next());
		
		System.out.print("Author: ");
		setAuthor(scanner.next());
		
		System.out.print("ISBN: ");
		setISBN(scanner.next());
		
		System.out.print("Published: ");
		setPublished(scanner.next());
		
		System.out.println();
		
		System.out.println("'H' for Hardcover, 'S' for Softcover.");		
		System.out.print("Hardcover or Softcover: ");
		setCover(scanner.next().toLowerCase());
		
		System.out.print("Category: ");
		setCategory(scanner.next());
		
	}
	
		
	private void setTitle(String title)
	{
		this.title = title;
	}
	
	private void setAuthor(String author)
	{
		this.author = author;
	}
	
	private void setISBN(String isbn)
	{
		this.isbn = isbn;
	}
	
	private void setPublished(String published)
	{
		this.published = published;
	}
	
	private void setCover(String cover)
	{
		if(cover == "h")
		{
			this.cover = "Hardcover";
		}
		else if(cover == "s")

		{
			this.cover = "Softcover";
		}
		else
		{
			System.out.println("Sorry, that input was not correct.");
			System.out.println("Please type a 'H' for Hardcover, and a 'S' for Softcover.");
			System.out.print("You can now type your awnser: ");
			setCover(scanner.next().toLowerCase());
		}
	}
	
	private void setCategory(String category)
	{
		this.category = category;
	}
	
	
	/***
	 * Will return a String[] of the book information provided by the user.
	 * @return
	 */
	public String[] getInformation()
	{
		String[] information = {title, author, isbn, published, cover, category};
		
		return information;		
	}
	
}
