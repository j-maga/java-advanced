package synchronization;

class Globe
{
	synchronized void print(int n)
	{
		for (int i=1; i<=5; i++)
		{
			System.out.println(i*n);
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

class NorthPole extends Thread
{
	Globe g;
	NorthPole (Globe g)
	{
		this.g = g;
	}
	
	public void run()
	{
		g.print(5);
	}
}

class SouthPole extends Thread
{
	Globe g;
	SouthPole (Globe g)
	{
		this.g = g;
	}
	
	public void run()
	{
		g.print(100);
	}
}

public class SyncMethod
{
	public static void main(String[] args)
	{
		Globe tab = new Globe();
		NorthPole c1 = new NorthPole(tab);
		SouthPole c2 = new SouthPole(tab);
		c1.start();
		c2.start();
		
	}

}
