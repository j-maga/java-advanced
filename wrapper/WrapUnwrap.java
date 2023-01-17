package wrapper;

class Objects
{
	String fruit1 = "Apples";
	String fruit2 = "Grapes";
	String fruit3 = "Oranges";
	
	String cover1 = new String(fruit1);
	String cover2 = new String(fruit2);
	String cover3 = new String(fruit3);
	
	String F1 = cover1;
	String F2 = cover2;
	String F3 = cover3;
}

public class WrapUnwrap
{
	public static void main(String[] args)
	{
		Objects obj = new Objects();
		System.out.println("Fruits and Respective Covers - ");
		System.out.println("Cover 1 - " +obj.cover1);
		System.out.println("Cover 2 - " +obj.cover2);
		System.out.println("Cover 3 - " +obj.cover3);
		
		System.out.println("Fruits in the Cover1 - " +obj.F1);
		System.out.println("Fruits in the Cover2 - " +obj.F2);
		System.out.println("Fruits in the Cover3 - " +obj.F3);
	}

}
