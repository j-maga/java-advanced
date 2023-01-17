package cloning;

class Bask
{
	String fruit1 = "apples";
	String fruit2 = "oranges";
	
	public Object clone()
	{
		try
		{
			return super.clone();
		}
		catch(Exception e)
		{
			System.out.println("Clone Not Supported ");
			return null;
		}
	}
	 
}

public class Clone implements Cloneable
{
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Bask b1 = new Bask();
		System.out.println("Basket 1 has "+ b1.fruit1 + " and "+ b1.fruit2);

		Bask b2 = (Bask) b1.clone();
		
		System.out.println("Basket 2 has "+ b2.fruit1 + " and "+ b2.fruit2);
		
		b1.fruit1 = "grapes";
		
		System.out.println("\nBasket 1 has "+ b1.fruit1 + " and "+ b1.fruit2);
		System.out.println("Basket 2 has "+ b2.fruit1 + " and "+ b2.fruit2);
	}

}