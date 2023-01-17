package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormats
{
	public static void main(String[] args)
	{
		SimpleDateFormat sd1 = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sd2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		SimpleDateFormat sd3 = new SimpleDateFormat("dd MMMM yyyy");
		SimpleDateFormat sd4 = new SimpleDateFormat("dd MMMM yyyy zzzz");
		Date dt = new Date();
		
		System.out.println("Date Format 1 : "+sd1.format(dt));
		System.out.println("\nDate Format 2 : "+sd2.format(dt));
		System.out.println("\nDate Format 3 : "+sd3.format(dt));
		System.out.println("\nDate Format 4 : "+sd4.format(dt));
	}
}