package date;

import java.util.Date;

public class Format
{
	public static void main(String[] args)
	{
		Date dt = new Date();
		String s = String.format("%tc", dt);
		System.out.println(s);
	}
}
