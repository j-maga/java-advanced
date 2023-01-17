package synchronization;

class Numerics implements Runnable
{
	int a;
	Numerics(int a)
	{
		this.a = a;
	}
	
	@Override
	public void run()
	{
		for (int i=1; i<=5; i++)
			System.out.println(i*a);		
	}
}

public class WithoutSync 
{
	public static void main(String[] args)
	{
		Numerics n1 = new Numerics(5);
		Numerics n2 = new Numerics(8);
		
		Thread t1 = new Thread(n1);
		Thread t2 = new Thread(n2);
		t1.start();
		t2.start();
	}

}
