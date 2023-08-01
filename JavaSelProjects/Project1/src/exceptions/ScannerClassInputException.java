package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerClassInputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		try {
			int a=input.nextInt();
			
			System.out.println(a);
		}catch(InputMismatchException ie)
		{
			System.out.println("Invalid input,Please try again..");
		}
		
		
		
		
		input.close();

	}

}
