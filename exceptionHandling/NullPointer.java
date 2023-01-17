package exceptionHandling;

public class NullPointer
{
	public static void main(String[] args) {
		String a = null;
		
		try
		{
			if (a.equals("maga"))
				System.out.println("Equal");
			else
				System.out.println("Not Equal");
		}
		
		catch(NullPointerException npe)
		{
			System.out.println("Null Pointer Exception");
		}
	}

}
