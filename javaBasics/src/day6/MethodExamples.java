package day6;

import java.util.Scanner;

public class MethodExamples {
public int largestNumber(int a, int b) { //instance method, can only be called within the class
	int lar;
	if(a>b) {
		lar=a;
	}
	else {
		lar=b;
	}
	return lar;
	
}
public static int addition(int num1, int num2) { //static method, can be called from different class
	int add;
	add=num1+num2;
	return add;
}
public static void main(String[] args) { //method with no return type, because we use void
	int x,y;
	MethodExamples obj= new MethodExamples();
	Scanner s= new Scanner(System.in);
	System.out.println("Enter 1st number:");
	x=s.nextInt();
	System.out.println("Enter 2st number:");
	y=s.nextInt();
	System.out.println("largest number is " + obj.largestNumber(x , y));
    System.out.println("sum is " + addition(x,y)); //when the static method is called from another class we have the use the class name also (MethodExamples.additions(). within the same class the class name can be omitted)
}
}
