package conditionalTest;

interface Bird
{
	void fly();
}

interface Fish
{
	public Bird fly();
}

/*
 * class GFish implements Fish { public void Bird fly() {
 * 
 * } }
 */

class KiwiBird implements Bird
{
	public void fly()
	{
		System.out.println("Kiwi don't fly");
	}
	
}

class InstanceOf {
	public static void main(String[] args) {
		Bird obj = new KiwiBird();
		System.out.println(obj instanceof Bird);
		System.out.println(obj instanceof KiwiBird);
	}
}

/*public class InstanceOf {
	public static void main(String[] args) {
		InstanceOf obj = new InstanceOf();
		System.out.println(obj instanceof InstanceOf);
	}

}*/