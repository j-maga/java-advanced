package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Parse
{
	public static void main(String[] args) throws ParseException
	{
		SimpleDateFormat sd = new SimpleDateFormat("E'\n'd-M-y G '\n'h:m a z");
		
		Calendar c = Calendar.getInstance();
		String date = "03/08/2022";
		
		System.out.println("Unparsed String : " +date);
		try
		{
			c.setTime(sd.parse(date));
		}
		catch (ParseException E)
		{
			
		}
		finally
		{
			System.out.println("Parsed String : " +c.getTime());
		}
	}
}