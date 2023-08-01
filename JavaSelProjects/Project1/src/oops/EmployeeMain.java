package oops;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee Alex=new Employee();
		
		System.out.println(Alex.emp_id+"\t"+Alex.emp_name+"\t"+Alex.emp_sal);
		
		Employee Daniel=new Employee();
		
		System.out.println(Daniel.emp_id+"\t"+Daniel.emp_name+"\t"+Daniel.emp_sal);
		
		Employee Stephen=new Employee(101,"Stephen J",35353.46);
		
		System.out.println(Stephen.emp_id+"\t"+Stephen.emp_name+"\t"+Stephen.emp_sal);
		
		Employee Nancy=new Employee(102,"Nancy T",66353.46);
		
		System.out.println(Nancy.emp_id+"\t"+Nancy.emp_name+"\t"+Nancy.emp_sal);

	}

}
