package date;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Sleep
{
	public static void main(String[] args) throws InterruptedException
	{
		while (true)
		{
			System.out.println(new Date());
			TimeUnit.SECONDS.sleep(3);
		}
	}
}
