import java.util.Scanner;

public class Menu {
  public static void displayMenu() {
    System.out.println("Press 1 to input a new book");
    System.out.println("Press 2 to view all books in the library");
    System.out.println("Press 3 to delete a book from the library");
    System.out.println("Press 0 to exit");
  }

  public static int getChoice() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your choice: ");
    return sc.nextInt();
  }

  public static void main(String[] args) {
    int choice;
    do {
      displayMenu();
      choice = getChoice();

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
}
