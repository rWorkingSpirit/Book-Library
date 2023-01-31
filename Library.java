
public class Library 
{
	public static void main(String[] args)
	{
		Application app = new Application();
		app.start();


		Menu.displayMenu();
		int choice;
	    

		do 
		{	
		  choice = Menu.getChoice();
	    
	        switch (choice) {
	        case 1:
	          System.out.println("You can input a new book");
	          break;
	        case 2:
	          System.out.println("You can view here all the books in the library");
	          break;
	        case 3:
	          System.out.println("You can delete a book from the library");
	          break;
	        case 0:
	          System.out.println("Exiting");
	          break;
	        default:
	          System.out.println("Please enter a correct number!");
	      }
	    } while (choice != 0);
	}
	
	
	// Goals voor Gideon
	// - class aanmaken met de naam Book.
	// En deze vullen met de juiste field etc.
	//
	// - Start Menu
	// De tekst die geprint wordt op het scherm.
	// En de (int) die terug gegeven wordt aan Application.
	
	//--------------------------------------------------------------------------
	
	// Goals voor Rutger
	// - Het verwijderen van een Book object.
	// - Deze Book Object moet ook verwijdert worden van het tekst bestand.
	
	
	
	
}
