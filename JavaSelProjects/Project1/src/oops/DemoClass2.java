package oops;

public class DemoClass2 {
	
	// Return type methods
	
	public static  long addThreeNum(long a ,long b,long c)
	{
		long res;
		res=a+b+c;
		return res;
	}
	
	public static float mulTwoVal(float x,float y)
	{
		return(x*y);
	}
	
	//void type methods
	
	public static void displayName(String x)
	{
		System.out.println("Entered User name is :"+x);
	}
	
	//return type :array type
	
	public static String[] nameList()
	{
		return new String[]{"Jason","alex","Daniel"};
	}
	
	public static  long[] numList(long[] x)
	{
		return x;
	}
	
	
	// main method
	
	public static void main(String[] args)
	{
		
			
		//calling reutrn type methods
		
		System.out.println(addThreeNum(10,20,30));
		System.out.println(mulTwoVal(1.5f,1.5f));
		
		String[] strArray1=nameList();
		
		for(String x:strArray1)
		{
			System.out.println(x);
		}
		
		long[] longArray=numList(new long[] {100,-4000,600});
		
		for(long x:longArray)
		{
			System.out.println(x);
		}
		
		// calling void type method
		
		displayName("Daniel");
	}

}
