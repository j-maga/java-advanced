package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search
{
	public static void main(String[] args)
	{
		String search;
		String s = "Birds fly in the Sky. Sky is blue in color. Sky has clouds. Birds like Eagle fly above the clouds.";
		Scanner sc = new Scanner(System.in);
		System.out.println(s);
		System.out.println("\nEnter a word to search : ");
		search = sc.next();
		
		Pattern p = Pattern.compile(search);
		Matcher m = p.matcher(s);
		
		if(m.find())
			System.out.println(search +" found at index "+ m.start()+" and ends at " +m.end());
	}
}