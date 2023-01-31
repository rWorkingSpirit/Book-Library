import java.util.Scanner;

class Menu 
{

	public static void displayMenu() 
	{
	  System.out.println("Press 1 to input a new book");
	  System.out.println("Press 2 to view all books in the library");
	  System.out.println("Press 3 to delete a book from the library");
	  System.out.println("Press 0 to exit");
	}

	public static int getChoice() 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter your choice: ");
	    return sc.nextInt();
	}

}
