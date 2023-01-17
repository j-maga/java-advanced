package genericprogramming;

class TestGeneric <T extends Number>
{
	T t;
	public TestGeneric(T t)
	{
		this.t = t;
	}
	
	public T getObj()
	{
		return t;
	}
}

public class Generic
{
	public static void main(String[] args)
	{
		TestGeneric<Integer> iObj = new TestGeneric<Integer>(28);
		TestGeneric<Float> fObj = new TestGeneric<Float>(28.5f);
	}
}
