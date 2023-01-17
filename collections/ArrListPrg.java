package collections.basic.prg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrListPrg
{
	public static void main(String[] args)
	{
		ArrayList<String> ar = new ArrayList<String>() {{add("Red"); add("Blue");}};
		ar.add("Green");
		ar.add(3, "Yellow");	//add using index
		System.out.println(ar);
		
		System.out.println(ar.get(2));	//get() method
		
		ar.set(1, "White");				//set() method
		
//		ListIterator<String> i = ar.listIterator(ar.size());
//		
//		while(i.hasPrevious())		//List Iterator Interface
//		{
//			String str = i.previous();
//			System.out.print(str+" ");
//		}
		
		
//		Collections.sort(ar);
//		ar.forEach(a->{System.out.print(a+" ");});	//For Each Loop - Lambda Expression
		
		ar.remove(1);
		ar.remove("White");
		System.out.println(ar);
	}
}
