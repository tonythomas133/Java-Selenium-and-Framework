package day3;

import java.util.Scanner;

public class HdivisibleBy3 {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		a=s.nextInt();
		b=a%3;
		if(b==0)
			System.out.println("The number is divisible by 3");
		else
			System.out.println("the number is not divisible by 3");
		

	}

}
