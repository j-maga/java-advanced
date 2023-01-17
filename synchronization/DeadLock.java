package synchronization;

class Q
{
	int n;
	boolean valueSet = false;
	
	synchronized int get()
	{
		while(!valueSet)
			try {
				wait();
			} catch (InterruptedException e) { }
		System.out.println("Got : "+n);
		valueSet = false;
		notify();
		return n;
	}
	
	synchronized void put(int n)
	{
		while (valueSet)
			try {
				wait();
			} catch (InterruptedException e) { }
		this.n = n;
		valueSet = true;
		System.out.println("Put : "+n);
		notify();		
	}
}

class Producer implements Runnable
{
	Q q;
	Producer (Q q)
	{
		this.q = q;
		new Thread(this, "Producer").start();
	}

	@Override
	public void run()
	{
		int i=0;
		while (true)
		{
			q.put(i++);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) { }
		}
	}
}

class Consumer implements Runnable
{
	Q q;
	Consumer (Q q)
	{
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	@Override
	public void run()
	{
		while(true)
		{
			q.get();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) { }
		}
	}
}

public class DeadLock
{
	public static void main(String[] args)
	{
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}
