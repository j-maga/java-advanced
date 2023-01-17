package collectionns;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class IntersectionUnion
{
	public <T>List<T>intersection(List<T>li1, List<T>li2)
	{
		List<T> li = new LinkedList<T>();
        for (T t : li1)
        {
             if(li2.contains(t))
             {
                  li.add(t);
             }
        }
        return li;
	}
	
	public <T> List<T> union(List<T> li1, List<T> li2)
    {
         Set<T> set = new HashSet<T>();
         set.addAll(li1);
         set.addAll(li2);
         return new LinkedList<T>(set);
    }
	
	public static void main(String[] args)
	{
		LinkedList <String>li1 = new LinkedList() {{add("Red"); add("Blue"); add("Black"); add("Green"); add("Yellow"); add("White"); add("Violet");}};
		LinkedList <String>li2 = new LinkedList() {{add("Blue"); add("Black"); add("Grey"); add("White"); add("Orange"); add("Brown"); add("Pink");}};
		
		
		System.out.println("\nIntersection\n" + new IntersectionUnion().intersection(li1, li2));
		System.out.println("\nUnion\n" + new IntersectionUnion().union(li1, li2));
	}

}
