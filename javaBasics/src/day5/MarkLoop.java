package day5;

import java.util.Scanner;

public class MarkLoop {

	public static void main(String[] args) {
		int i, limit, mark;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the value for limit");
		limit=s.nextInt();
		for(i=0; i<limit; i++) {  
			System.out.println("Enter mark");
			mark=s.nextInt();
			System.out.println("mark is " + mark);
		}

	}

}
