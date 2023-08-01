package oops;

public class EmployeeDemo {
	
	// Data members or fields 
	
		 private int emp_id;
		 private String emp_name;
		 private double emp_sal;
		
		// Default Constructor
		public EmployeeDemo()
		{
			
		}
		
		// Argument Constructor
		
		public EmployeeDemo(int emp_id1,String emp_name1,double emp_sal1)
		{
			emp_id=emp_id1;
			emp_name=emp_name1;
			emp_sal=emp_sal1;
			
		}
		
		// Return type methods
		
		public int getempId()
		{
			return emp_id;
		}
		
		public String getempName()
		{
			return emp_name;
		}
		
		public double getempSal()
		{
			return emp_sal;
		}
}
