package oops;

public class EmployeeDemoMain {

	public static void main(String[] args) {
		
		EmployeeDemo Alex=new EmployeeDemo();
		
		System.out.println(Alex.getempId()+"\t"+Alex.getempName()+"\t"+Alex.getempSal());
		
		EmployeeDemo Daniel=new EmployeeDemo();
		
		System.out.println(Daniel.getempId()+"\t"+Daniel.getempName()+"\t"+Daniel.getempSal());
		
		EmployeeDemo Stephen=new EmployeeDemo(101,"Stephen J",35353.46);
		
		System.out.println(Stephen.getempId()+"\t"+Stephen.getempName()+"\t"+Stephen.getempSal());
		
		EmployeeDemo Nancy=new EmployeeDemo(102,"Nancy T",66353.46);
		
		System.out.println(Nancy.getempId()+"\t"+Nancy.getempName()+"\t"+Nancy.getempSal());

	}

}
