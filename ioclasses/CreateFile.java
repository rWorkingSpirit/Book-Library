package ioclasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;

import book.*;

public class CreateFile 
{
	HashMap<String, String> bookInfo = new HashMap<String, String>();
	
	public CreateFile(ArrayList<Book> books) throws IOException
	{
		CreateText(books);
		
		
		Path p = Paths.get("src/LibraryFile");
		
		
		
		// If file exists
		if(Files.exists(p))
		{
			Files.write(p, String.format("%s%n", bookInfo).getBytes(), StandardOpenOption.APPEND);
		}
		else // Create file if it does not exist.
		{
			p.toFile().createNewFile();
			Files.write(p, String.format("%s%n", bookInfo).getBytes(), StandardOpenOption.WRITE);
		}
		
	}
	
	void CreateText(ArrayList<Book> books)
	{
		for(Book b: books)
		{
			bookInfo.put("Title:", b.getTitle());
			bookInfo.put("Author:", b.getAuthor());
			bookInfo.put("ISBN:", b.getIsbn());
			bookInfo.put("Cover:", b.getCover());
			bookInfo.put("Category:", b.getCategory());
		}
	}
}
