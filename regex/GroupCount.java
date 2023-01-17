package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupCount {

	public static void main(String[] args)
	{
		int occur=0;
		String s="Sairamkrishna Mammahe lives in the Sairamkrishna Colony. Sairamkrishna House was built by Sairamkrishna";
		
		Pattern p = Pattern.compile("(Sairam)(krishna)");
		Matcher m = p.matcher(s);
		
		int count = m.groupCount();
		System.out.println("Number of Groups "+count);
		
		while (m.find())
			occur++;
		System.out.println("\nNo. of Occurence of the Word " + p +" is "+occur);
	}

}
