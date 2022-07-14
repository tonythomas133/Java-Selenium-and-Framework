package day8;

import java.util.Scanner;

class EmployeeDetails1 {
	String name = new String();
	int age;
	int empid;
	EmployeeDetails1(String name1, int age1, int empid1) {
		this.name=name1;
		this.age=age1;
		this.empid=empid1;
		System.out.println("the values have been assigned");
	}
}
public class EmpNameAgeId {

	public static void main(String[] args) {
		int age, empid;
		String name = new String();
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter name");
			name= s.next();
			System.out.println("Enter age");
			age=s.nextInt();
			System.out.println("Enter empid");
			empid=s.nextInt();
		}
		EmployeeDetails1 obj = new EmployeeDetails1(name,age,empid);
        System.out.println("name " + obj.name);		
        System.out.println("age " + obj.age);
        System.out.println("empid " + obj.empid);
	}

}
