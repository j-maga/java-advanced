package cloning;

class Baskt
{
	String fruit1 = "apples";
	String fruit2 = "oranges";
}

public class Deep {
	public static void main(String[] args) {
		Baskt b1 = new Baskt();
		Baskt b2 = new Baskt();
		
		b2.fruit1 = b1.fruit1;
		b2.fruit2 = b1.fruit2;
		
		System.out.println("Basket 1 has "+ b1.fruit1 + " and "+ b1.fruit2);
		System.out.println("Basket 2 has "+ b2.fruit1 + " and "+ b2.fruit2);
		
		b1.fruit1 = "grapes";
		
		System.out.println("\nBasket 1 has "+ b1.fruit1 + " and "+ b1.fruit2);
		System.out.println("Basket 2 has "+ b2.fruit1 + " and "+ b2.fruit2);		
	}

}
