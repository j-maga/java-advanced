package synchronization;

class Table
{
	void print(int n)
	{
		synchronized (this)
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
}

class Child1 extends Thread
{
	Table t;
	Child1 (Table t)
	{
		this.t = t;
	}
	
	public void run()
	{
		t.print(5);
	}
}

class Child2 extends Thread
{
	Table t;
	Child2 (Table t)
	{
		this.t = t;
	}
	
	public void run()
	{
		t.print(100);
	}
}

public class SyncBlock
{
	public static void main(String[] args)
	{
		Table tab = new Table();
		Child1 c1 = new Child1(tab);
		Child2 c2 = new Child2(tab);
		c1.start();
		c2.start();
		
	}

}
