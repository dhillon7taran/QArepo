package oops;

public class DemoClassStaticMain {

	public static void main(String[] args) {
		
		
		//calling reutrn type methods
		
		System.out.println(DemoClassStatic.addThreeNum(10,20,30));
		System.out.println(DemoClassStatic.mulTwoVal(1.5f,1.5f));
		
		String[] strArray1=DemoClassStatic.nameList();
		
		for(String x:strArray1)
		{
			System.out.println(x);
		}
		
		long[] longArray=DemoClassStatic.numList(new long[] {100,-4000,600});
		
		for(long x:longArray)
		{
			System.out.println(x);
		}
		
		// calling void type method
		
		DemoClassStatic.displayName("Daniel");


	}

}
