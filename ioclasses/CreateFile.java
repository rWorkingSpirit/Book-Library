package ioclasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CreateFile 
{
	CreateFile() throws IOException
	{
		
		Path p = Paths.get("LibraryFile");
		
		
		
		// If file exists
		if(Files.exists(p))
		{
//			Files.write(p, String.format("%s%n",INPUT THE DATA FOR THE FILE HERE).getBytes(), StandardOpenOption.APPEND);
		}
		else // Create file if it does not exist.
		{
			p.toFile().createNewFile();
//			Files.write(p, String.format("%s%n",INPUT THE DATA FOR THE FILE HERE).getBytes(), StandardOpenOption.APPEND);
		}
		
	}
}
