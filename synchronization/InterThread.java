package synchronization;

class Bank
{
	int amount = 1000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("Going to withdraw...");
		
		if (this.amount<amount)
		{
			System.out.println("Less Balance, Waiting for Deposit...");
			try
			{
				wait();
			}
			catch(Exception e)
			{				
			}
			this.amount -= amount;
			System.out.println("Withdraw completed...");
		}
	}
	
	synchronized void deposit(int amount)
	{
		System.out.println("Going to deposit...");
		this.amount += amount;
		System.out.println("Deposit Completed...");
		notify();
	}
}

public class InterThread
{
	public static void main(String[] args)
	{
		final Bank b = new Bank();
		
		Thread t1 = new Thread()
				{
			public void run()
			{
				b.withdraw(15000);
			}
				};
		t1.start();
		
		Thread t2 = new Thread()
				{
			public void run()
			{
				b.deposit(10000);
			}
				};
		t2.start();
	}
}
