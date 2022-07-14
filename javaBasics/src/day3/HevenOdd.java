package day3;

import java.util.Scanner;

public class HevenOdd {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value greater than 1");
		a=s.nextInt();
		if(a>1)
		{
			b=a%2;
			if(b==0)
				System.out.println("The number is even");
			else
				System.out.println("the number is odd");
		
		}
		else
			System.out.println("the number is less than 1");
	}

}
