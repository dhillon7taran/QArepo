package oops;

public class Interface3Class2Impl implements Interface3{

	@Override
	public int addTwoNum(int x, int y) {
		
		return (x+y+1000);
	}

	@Override
	public void displayCourse(String coursename) {
		// TODO Auto-generated method stub
		System.out.println("Hi Student : Welcome to "+coursename+" training program");
	}

	@Override
	public void displayFullName(String fname, String lname) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome"+fname+"\t"+lname);
		
	}

	@Override
	public float mulTwoVal(float x, float y) {
		// TODO Auto-generated method stub
		return (x*y*1000);
	}

}
