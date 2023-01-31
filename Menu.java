import java.util.Scanner;

public class Menu {
  
    Scanner sc = new Scanner(System.in);
    int keuze;

    do {
      System.out.println("Press 1 to input a new book");
      System.out.println("Press 2 to view all books in the library");
      System.out.println("Press 3 to delete a book from the library");
      System.out.println("Press 0 to exit");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();

      switch (keuze) {
        case 1:
          System.out.println("You selected option 1: Input a new book");
          break;
        case 2:
          System.out.println("You selected option 2: View all books in the library");
          break;
        case 3:
          System.out.println("You selected option 3: Delete a book from the library");
          break;
        case 0:
          System.out.println("Exiting");
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    } while (keuze != 0);
  
}
