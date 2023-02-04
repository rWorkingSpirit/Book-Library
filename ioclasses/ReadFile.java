package ioclasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile 
{
	public void Read() throws IOException
	{
		Path p = Paths.get("src/LibraryFile");
		
		Files.lines(p).forEach(line -> System.out.println(line));
	}
}
