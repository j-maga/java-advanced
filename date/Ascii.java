package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ascii
{
	public static void main(String[] args)
	{
		SimpleDateFormat sd = new SimpleDateFormat("E'\n'd-MMM-y G '\n'h:m a z");
		Date dt = new Date();
		
		System.out.println(sd.format(dt));
	}
}