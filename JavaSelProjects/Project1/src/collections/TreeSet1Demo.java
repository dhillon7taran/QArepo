package collections;


import java.util.Set;
import java.util.TreeSet;

public class TreeSet1Demo {
	
	public static void main(String[] args)
	{
		//ArrayList<String> nlist=new ArrayList<String>();
		
		Set<String> nameslist=new TreeSet<String>();
		
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
