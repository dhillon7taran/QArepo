package coreJava.arrays;

public class ArrayDemo1 {
	public static void main(String[] args) {
		
		int[] intArray= {100,200,-600,450,3464,3643,6};
		
		//int[] intarray1=new int[] {100,200,-600,450,3464,3643,6};
		
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]);
		}
		
		System.out.println();
		
		for(int x:intArray)
		{
			System.out.println(x);
		}

	}

}
