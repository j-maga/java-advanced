package synchronization;

class Home
{
	synchronized static void print(int n)
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

class East extends Thread
{
	Home H;
	East (Home H)
	{
		this.H = H;
	}
	
	public void run()
	{
		H.print(5);
	}
}

class West extends Thread
{
	Home H;
	West (Home H)
	{
		this.H = H;
	}
	
	public void run()
	{
		H.print(100);
	}
}

public class StaticSync
{
	public static void main(String[] args)
	{
		Home h = new Home();
		East e = new East(h);
		West w = new West(h);
		e.start();
		w.start();
		
	}

}
