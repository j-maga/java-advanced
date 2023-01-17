package cloning;

class Student
{
	String name;
	int ID;
	String sub1, sub2;
}

public class Copy {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Maga";
		s1.ID = 28;
		s1.sub1 = "Maths";
		s1.sub2 = "Physics";
		System.out.println("Name: "+s1.name +"\tID: "+s1.ID + "\nSub 1: "+ s1.sub1 + "\nSub 2: "+s1.sub2);
		
		Student s2 = s1;
		System.out.println("\nShallow Copy");
		System.out.println("Name: "+s2.name +"\tID: "+s2.ID + "\nSub 1: "+ s2.sub1 + "\nSub 2: "+s2.sub2);
		
		Student s3 = new Student();
		s3.name = s1.name;
		s3.ID = s1.ID;
		s3.sub1 = s1.sub1;
		s3.sub2 = s1.sub2;
		System.out.println("\nDeep Copy");
		System.out.println("Name: "+s3.name +"\tID: "+s3.ID + "\nSub 1: "+ s3.sub1 + "\nSub 2: "+s3.sub2);
		
		s1.ID = 7;
		System.out.println("\nModifying ID\n- - Original - -");
		System.out.println("Name: "+s1.name +"\tID: "+s1.ID + "\nSub 1: "+ s1.sub1 + "\nSub 2: "+s1.sub2);
		System.out.println("\n- - Shallow Copy - -");
		System.out.println("Name: "+s2.name +"\tID: "+s2.ID + "\nSub 1: "+ s2.sub1 + "\nSub 2: "+s2.sub2);
		System.out.println("\n- - Deep Copy - -");
		System.out.println("Name: "+s3.name +"\tID: "+s3.ID + "\nSub 1: "+ s3.sub1 + "\nSub 2: "+s3.sub2);
	}

}
