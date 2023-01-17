package regex;

import java.util.regex.Pattern;

public class Split
{
	public static void main(String[] args)
	{
		String s = "20-08-1999";
		
		Pattern p = Pattern.compile("-");
		String []sentence = p.split(s);
		
		for (String word:sentence)
			System.out.println(word);
	}
}
