package day6;

import java.util.Scanner;

public class Calculator {
public int add(int num1, int num2) {
	int result;
	result=num1+num2;
	return result;
}
public int sub(int num1, int num2) {
	int result;
	result=num1-num2;
	return result;
}
public static int mult(int num1, int num2) {
	int result;
	result=num1*num2;
	return result;
}
public static double div(double num1, double num2) {
	double result;
	result=num1/num2;
	return result;
}
	public static void main(String[] args) {
		int option, a, b;
		Scanner s=new Scanner(System.in);
		Calculator obj= new Calculator();
		System.out.println("Enter 2 numbers");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("1. addition   2.subtraction   3.multiplication   4.division");
		option=s.nextInt();
		switch(option) {
		case 1: System.out.println(obj.add(a, b));break;
		case 2: System.out.println(obj.sub(a, b)) ; break;
		case 3: System.out.println(mult(a, b)) ; break;
		case 4: System.out.println(Calculator.div((double)a, (double)b)) ; break;
		default: System.out.println("Option does not exist"); break;
		}

	}

}
