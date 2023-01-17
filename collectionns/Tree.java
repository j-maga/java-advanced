package collectionns;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Tree
{
	public static void main(String[] args)
	{
		TreeSet<String> colors = new TreeSet<String>()
		{{add("Red"); add("Blue"); add("Green"); add("Yellow"); add("White"); add("Black");}};
		
		Iterator <String> i = colors.iterator();
		System.out.println("- - - TreeSet Elements : - - -");
		
		while (i.hasNext())
			System.out.print(i.next()+" ");
		
		System.out.println("\n\nSize of the TreeSet : "+colors.size());
		
		System.out.println("\nFirst Element : "+colors.first());
		System.out.println("Last Element : "+colors.last());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter element to delete ");
		String value = sc.next();
		colors.remove(value);
		System.out.println(value+" Removed!");
		
		System.out.println("\nRemoving all elements!");
		colors.clear();
		System.out.println("\nTreeSet Empty? "+colors.isEmpty());
		
		
	}

}
