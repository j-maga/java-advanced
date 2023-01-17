package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate
{
	public static void main(String[] args)
	{
		SimpleDateFormat sd = new SimpleDateFormat();
		Date dt = new Date();
		
		System.out.println(sd.format(dt));
	}
}
