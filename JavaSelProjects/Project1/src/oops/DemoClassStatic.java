package oops;

public class DemoClassStatic {
	
	// Return type methods
	
	public static long addThreeNum(long a ,long b,long c)
	{
		long res;
		res=a+b+c;
		return res;
	}
	
	public static  float mulTwoVal(float x,float y)
	{
		return(x*y);
	}
	
	//void type methods
	
	public static void displayName(String x)
	{
		System.out.println("Entered User name is :"+x);
	}
	
	//return type :array type
	
	public static  String[] nameList()
	{
		return new String[]{"Jason","alex","Daniel"};
	}
	
	public  static long[] numList(long[] x)
	{
		return x;
	}

}
