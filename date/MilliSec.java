package date;

import java.util.Date;

public class MilliSec
{
	public static void main(String[] args) throws InterruptedException
	{
		long begin = System.currentTimeMillis();
		System.out.println(new Date());
		
		Thread.sleep(300000);
		
		long terminate = System.currentTimeMillis();
		System.out.println(new Date());
		
		long diff = terminate - begin;
		
		System.out.println("Difference in Milliseconds is : "+diff);
	}

}
