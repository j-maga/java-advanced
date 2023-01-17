package date;

import java.util.Calendar;
import java.util.Date;

public class Tostring
{
	public static void main(String[] args)
	{
		Calendar ct = Calendar.getInstance();
		Date dt = ct.getTime();
		
		System.out.println(dt.toString());
	}
}