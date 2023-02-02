package book;


/***
 * You are able to create a new Book object
 * and return it within this class.
 * @author RoyRooseboom
 *
 */
public class CreateBook
{
	Book book = new Book();
	
	String[] bookInformation;

	
	public Book fillBook(String[] info)
	{
		bookInformation = info;
		
		
		Book book = new Book();
		
		book.setTitle(bookInformation[0]);
		book.setAuthor(bookInformation[1]);
		book.setIsbn(bookInformation[2]);
		book.setCover(bookInformation[3]);
		book.setCategory(bookInformation[4]);
		
		return book;
		
	}
	
}
