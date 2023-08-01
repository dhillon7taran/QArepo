package oops;

public class Interface3Class12ImplMain {
	
	
	public static void main(String[] args)
	{
//		Interface3Class1Impl instance=new Interface3Class1Impl();
		
		Interface3  obj1=new Interface3Class1Impl();
		
		System.out.println(obj1.addTwoNum(10,20));
		System.out.println(obj1.mulTwoVal(1.5f,1.5f));	
		
		obj1.displayCourse("Python");
		obj1.displayFullName("John","Connor");
		
		System.out.println();
		
		
		Interface3  obj2=new Interface3Class2Impl();
		
		System.out.println(obj2.addTwoNum(10,20));
		System.out.println(obj2.mulTwoVal(1.5f,1.5f));	
		
		obj2.displayCourse("Python");
		obj2.displayFullName("John","Connor");
		
	}
	


}
