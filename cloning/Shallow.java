package cloning;

class Basket
{
	String fruit1 = "apples";
	String fruit2 = "oranges";
}

public class Shallow {
	public static void main(String[] args) {
		Basket b1 = new Basket();
		Basket b2 = b1;
		
		System.out.println("Basket 1 has "+ b1.fruit1 + " and "+ b1.fruit2);
		System.out.println("Basket 2 has "+ b2.fruit1 + " and "+ b2.fruit2);
		
		b1.fruit1 = "grapes";
		
		System.out.println("\nBasket 1 has "+ b1.fruit1 + " and "+ b1.fruit2);
		System.out.println("Basket 2 has "+ b2.fruit1 + " and "+ b2.fruit2);		
	}

}
