package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOException {

	public static void main(String[] args) throws java.io.IOException, FileNotFoundException 
	{
		int i;
		FileInputStream fs = new FileInputStream("E:\temp.txt");
		
		while ((i=fs.read())!=-1)
		{
			System.out.println((char)i);
		}
		fs.close();
	}

}
