package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhiteSpace
{
	public static void main(String[] args)
	{
		String s = "Birds fly in the Sky. Sky is blue in color. Sky has clouds. Birds like Eagle fly above the clouds.";
		System.out.println(s);
		
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher(s);
		
		s = m.replaceAll("");
		System.out.println("\n\nAfter Replacing : ");
		System.out.println(s);
	}
}
