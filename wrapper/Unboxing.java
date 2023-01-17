package wrapper;

public class Unboxing {
	public static void main(String[] args) {
		String Box1 = new String("Barbie");
		String Box2 = new String("Car");
		
		String doll1 = Box1;
		String doll2 = Box2;
		
		System.out.println("Doll 1 - "+ doll1 +"\nDoll 2 - "+ doll2);
	}
}
