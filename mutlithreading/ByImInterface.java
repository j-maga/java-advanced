package mutlithreading;

class Color implements Runnable
{
	String colors[] = {"Green", "Red", "Yellow", "Violet", "Orange"};
	
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(colors[i]);
		}
	}
}

class Fruit implements Runnable
{
	String fruits[] = {"Guava", "Apple", "Mango", "Grapes", "Orange"};
	
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(fruits[i]);
		}
	}
}

public class ByImInterface
{
	public static void main(String[] args)
	{
		Color clr = new Color();
		Fruit fru = new Fruit();
		
		Thread t1 = new Thread(clr);
		Thread t2 = new Thread(fru);
		
		t1.start();
		t2.start();
	}
}
