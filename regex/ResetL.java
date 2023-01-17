package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResetL
{
	public static void main(String[] args)
	{
		String s="get jam zig";
		
		Pattern p = Pattern.compile("[gjz][eai][tmg]");
		Matcher m = p.matcher(s);
		
		while (m.find())
			System.out.println(m.group());
		
		m.reset("get jam zag");
		
		while (m.find())
			System.out.println(m.group());
	}
}
