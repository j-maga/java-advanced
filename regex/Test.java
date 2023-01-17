package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args)
	{
		String s = "Birds fly in the Sky. Sky is blue in color. Sky has clouds. Birds like Eagle fly above the clouds.";
		Pattern p = Pattern.compile("clouds.$");
		Matcher m = p.matcher(s);
		
		while (m.find())
		{
			System.out.println(m.group() +" starts at " + m.start() +" ends at "+ m.end());
		}
	}

}
