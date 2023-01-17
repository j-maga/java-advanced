package date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gregorian
{
    public static void main(String args[])
    {
    	String []Month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    	int year;
    	
    	GregorianCalendar calendar = new GregorianCalendar();
    	
    	System.out.print("Date: ");
    	System.out.print(Month[calendar.get(Calendar.MONTH)]);
    	System.out.print(" " + calendar.get(Calendar.DATE) + " ");
    	System.out.println(year = calendar.get(Calendar.YEAR));
    	System.out.print("Time: ");
    	System.out.print(calendar.get(Calendar.HOUR) + ":");
    	System.out.print(calendar.get(Calendar.MINUTE) + ":");
    	System.out.println(calendar.get(Calendar.SECOND));
    	
    	if(calendar.isLeapYear(year))
    	{
    		System.out.println("The current year is a leap year");
    	}
    	else
    	{
    		System.out.println("The current year is not a leap year");
    	}
   }
}
