package day8;

class EmployeeDetails {
	
	int age;
	int empid;
	//contructor
	EmployeeDetails() { //default constructor; does not have any parameters passed into it
		System.out.println("constructer 1 called");
	}
	//parameterised constructor        constructors help us to initialise variables within a class with out creating a specific method for the same
	EmployeeDetails(int age, int empid) {
			this.age=age;
			this.empid=empid;
			System.out.println("constructor 2 called");
		}
}

public class Constructer {

	public static void main(String[] args) {
		EmployeeDetails obj = new EmployeeDetails();
		EmployeeDetails obj1 = new EmployeeDetails(25,30);
		System.out.println(obj.age);
		System.out.println(obj.empid);
		System.out.println(obj1.age);
		System.out.println(obj1.empid);
		

	}

}
