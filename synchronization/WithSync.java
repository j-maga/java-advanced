package synchronization;

class Numeric implements Runnable
{
	int a;
	Numeric(int a)
	{
		this.a = a;
	}
	
	@Override
	synchronized public void run()
	{
		synchronized(this)
		{
			for (int i=1; i<=5; i++)
			{
				System.out.println(i*a);
				try
				{
					Thread.sleep(1000);
				}
				catch (Exception e)
				{
					
				}
			}
		}
	}
}

public class WithSync 
{
	public static void main(String[] args)
	{
		Numeric n1 = new Numeric(5);
				
		Thread t1 = new Thread(n1);
		Thread t2 = new Thread(n1);
		t1.start();
		t2.start();
	}

}
