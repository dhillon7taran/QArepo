package exceptions;

public class Inputecepdemo {

	public static void main(String[] args) {
		
		
		int a=5,b=0,c;
		
		try {
			c=a/b;
			System.out.println(c);
			
		}catch(ArithmeticException ae)
		{
			//System.out.println(ae.getMessage());
			
			System.out.println("Divide by zero,Please try again");
			
		}
		

	}

}
