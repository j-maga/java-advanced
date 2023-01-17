package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound
{
	public static void main(String[] args)
	{
		try
		{
			File file = new File("E:\tmp.txt");
			FileReader fr = new FileReader(file);
		}
		
		catch(FileNotFoundException fne)
		{
			System.out.println("File not Exists!");
		}
	}
}
