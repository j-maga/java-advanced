package mutlithreading;

class KeySet1 extends Thread
{
	String key1[] = {"F1", "F2", "F3", "F4", "F5", "F6", "F7"};
	
	public void run()
	{
		for(int i=0; i<7; i++)
		{
			System.out.println(key1[i]);
		}
	}
}

class KeySet2 extends Thread
{
	String key2[] = {"Escape", "Delete", "Space", "Alt", "Tab", "Shift", "Ctrl"};
	
	public void run()
	{
		for(int i=0; i<7; i++)
		{
			System.out.println(key2[i]);
		}
	}
}

public class ByExClass
{
	public static void main(String[] args)
	{
		KeySet1 k1 = new KeySet1();
		KeySet2 k2 = new KeySet2();
		
		k1.start();
		k2.start();
	}
}
