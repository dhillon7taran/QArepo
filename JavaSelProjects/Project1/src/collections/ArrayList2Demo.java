package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2Demo {
	
	public static void main(String[] args)
	{
		//ArrayList<String> nlist=new ArrayList<String>();
		
		List<String> nameslist=new ArrayList<String>();
		
		nameslist.add("Nancy");
		nameslist.add(1, "Alex");
		nameslist.add("Stephen");
		nameslist.add("Daniel");
		nameslist.add("John");
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
