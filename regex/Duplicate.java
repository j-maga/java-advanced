package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Duplicate
{
	public static void main(String[] args)
	{
		String search;
		int count=0;
		String s = "Birds fly in the Sky. Sky is blue in color. Sky has clouds. Birds like Eagle fly above the clouds.";
		Scanner sc = new Scanner(System.in);
		System.out.println(s);
		System.out.println("\nEnter a word to find duplicate : ");
		search = sc.next();
		
		Pattern p = Pattern.compile(search);
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			count++;
			if (count>1)
				System.out.println("Duplicate Found at index "+m.start());
		}
		
		if (count==0 || count==1)
			System.out.println("Duplicate Not Found");
		
	}
}