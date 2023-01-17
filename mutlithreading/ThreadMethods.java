package mutlithreading;

class Num implements Runnable
{
	public void run()
	{
		for (int i=0; i<5; i++)
			System.out.println(i);
	}
}

public class ThreadMethods
{
	public static void main(String[] args) throws InterruptedException
	{
		Num n = new Num();
		Thread t1 = new Thread(n);
		Thread t2 = new Thread(n);
		Thread t3 = new Thread(n);
		Thread t4 = new Thread(n);
		
		System.out.println("Thread Class "+t1.getClass());
		System.out.println("Thread Name "+t1.getName());
		System.out.println("Priority "+t1.getPriority());
		
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		t1.interrupt();
		t1.join();
		System.out.println(t1.getState());
		System.out.println();
		System.out.println("Thread 1 Interrupted? "+t1.isInterrupted());
		
		t2.start();
		System.out.println("Thread 2 Alive? "+t2.isAlive());
		
		t3.start();		
		t4.start();
		System.out.println("Thread 2 Interrupted? "+t2.isInterrupted());	
	}
}
