package coreJava.loopstmts;

public class NestedForLoop2 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Welcome");
		}
		
		System.out.println();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}

	}

}