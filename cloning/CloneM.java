package cloning;

public class CloneM implements Cloneable
{
	String fruit1 = "apples";
	String fruit2 = "oranges";
	
	public static void main(String[] args) 
	{
		CloneM b1 = new CloneM();
		System.out.println("Basket 1 has "+ b1.fruit1 + " and "+ b1.fruit2);
		
		try
		{
		CloneM b2 = (CloneM) b1.clone();
		
		
		System.out.println("Basket 2 has "+ b2.fruit1 + " and "+ b2.fruit2);
		
		b1.fruit1 = "grapes";
		
		System.out.println("\nBasket 1 has "+ b1.fruit1 + " and "+ b1.fruit2);
		System.out.println("Basket 2 has "+ b2.fruit1 + " and "+ b2.fruit2);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}