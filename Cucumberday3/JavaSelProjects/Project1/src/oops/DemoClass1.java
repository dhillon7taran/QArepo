package oops;

public class DemoClass1 {
	
	// Return type methods
	
	public long addThreeNum(long a ,long b,long c)
	{
		long res;
		res=a+b+c;
		return res;
	}
	
	public float mulTwoVal(float x,float y)
	{
		return(x*y);
	}
	
	//void type methods
	
	public void displayName(String x)
	{
		System.out.println("Entered User name is :"+x);
	}
	
	//return type :array type
	
	public  String[] nameList()
	{
		return new String[]{"Jason","alex","Daniel"};
	}
	
	public  long[] numList(long[] x)
	{
		return x;
	}
	
	
	// main method
	
	public static void main(String[] args)
	{
		
		DemoClass1 obj=new DemoClass1();
		
		//calling reutrn type methods
		
		System.out.println(obj.addThreeNum(10,20,30));
		System.out.println(obj.mulTwoVal(1.5f,1.5f));
		
		String[] strArray1=obj.nameList();
		
		for(String x:strArray1)
		{
			System.out.println(x);
		}
		
		long[] longArray=obj.numList(new long[] {100,-4000,600});
		
		for(long x:longArray)
		{
			System.out.println(x);
		}
		
		// calling void type method
		
		obj.displayName("Daniel");
	}

}
