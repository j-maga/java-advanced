package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllMatches {

	public static void main(String[] args)
	{
		String s = "Java 8";
		
		Pattern p = Pattern.compile("Java \\d");
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			System.out.println(m.matches());
		}
	}

}
