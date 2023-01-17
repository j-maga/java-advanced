package collectionns;

import java.util.LinkedHashSet;

class Student
{
    String name;
    int id;
     
    Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
     
    public int hashCode()
    {
        System.out.println("In hashcode method");
        int hashcode = 0;
        return hashcode;
    }
    
    public boolean equals(Object obj)
    {
        System.out.println("In equals method");
        if (obj instanceof Student)
        {
            Student emp = (Student) obj;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }     
    public String toString()
    {
        return "Employee Id: "+id+"  Name: "+name;
    }
}


public class DuplicateObj
{
	public static void main(String[] args)
	{
		LinkedHashSet<Student> L = new LinkedHashSet<Student>();
		
        L.add(new Student("James", 1));
        L.add(new Student("Lucas", 2));
        L.add(new Student("Oliver", 3));
        
        for(Student std:L)
        {
            System.out.println(std);
        }
        
        Student duplicate = new Student("James", 1);
        System.out.println("\n\nInserting duplicate record...");
        L.add(duplicate);
        System.out.println("After insertion:");
        
        for(Student std:L)
        {
            System.out.println(std);
        }
	}
}