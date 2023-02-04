package ioclasses;

import java.io.*;

public class DeleteFile 
{
	public void Delete()
	{
		File file = new File("src/LibraryFile");
		
		if (file.delete())
		{
            System.out.println("File deleted successfully");
            System.out.println();
        }
        else
        {
            System.out.println("Failed to delete the file");
            System.out.println();
        }
	}
}
