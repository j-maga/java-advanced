package genericprogramming;

class Bound<T extends A & B>
{
	private T objRef;
	
	public Bound(T obj)
	{
		this.objRef = obj;
	}
	
	public void doRunTest()
	{
		this.objRef.display();
	}
}

interface B
{
	public void display();
}

class A implements B
{
	public void display()
	{
		System.out.println();		
	}
}
public class BoundMany
{
	public static void main(String[] args)
	{
		Bound<A> b = new Bound<A>(new A());
		b.doRunTest();
	}
}
