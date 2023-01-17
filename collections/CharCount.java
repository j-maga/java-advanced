package collections.basic.prg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CharCount
{
	public static void main(String[] args)
	{
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		s=sc.next();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		System.out.println(hm);
		
		char[] c = s.toCharArray();
		
		for(char i:c)
		{
			if(hm.containsKey(i))
				hm.put(i, hm.get(i)+1);
			else
				hm.put(i, 1);
		}
		
		System.out.println(hm);
		Set<Entry<Character, Integer>> se = hm.entrySet();
		
		System.out.println("\nDuplicates:");
		for (Map.Entry<Character, Integer> entry:se)
		{
			if(entry.getValue()>1)
				System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("\nHigh Occurence:");
		for (Map.Entry<Character, Integer> entry:se)
		{
			if(entry.getValue()>1)
				System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}