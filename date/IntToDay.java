package date;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class IntToDay {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int day, month, year;
		
		System.out.println("Enter Date");
		day=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();
		
		Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH,month-1);
        cal.set(Calendar.DAY_OF_MONTH,day);
        cal.set(Calendar.YEAR,year);
String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        System.out.println(dayOfWeek);
	}

}
