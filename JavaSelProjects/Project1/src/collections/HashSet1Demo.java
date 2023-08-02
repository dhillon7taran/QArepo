package collections;


import java.util.HashSet;
import java.util.Set;


public class HashSet1Demo {
	
	public static void main(String[] args)
	{
		//ArrayList<String> nlist=new ArrayList<String>();
		
		Set<String> nameslist=new HashSet<String>();
		
		nameslist.add("Nancy");
		nameslist.add("Alex");
		nameslist.add("Stephen");
		nameslist.add("Daniel");
		nameslist.add("John");
		
		nameslist.add("John");
		nameslist.add("John");
		nameslist.add("John");
		nameslist.add("John");
		nameslist.add("John");
		
		
		nameslist.add(null);
		nameslist.add(null);
		nameslist.add(null);
		nameslist.add(null);
		nameslist.add(null);
		
	//	System.out.println(nameslist.get(4));
		
		for(String  x:nameslist)
		{
			System.out.println(x);
		}
		
		
	}

}
