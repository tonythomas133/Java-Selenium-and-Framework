package day3;
import java.util.Scanner;
public class HgreaterNumber {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter unique values for A and B");
		a=s.nextInt();
		b=s.nextInt();
		if(a!=b)
		{
			if(a>b)
				System.out.println("A is greater than B");
			else
				System.out.println("B is greater than A");
		}
		else
			System.out.println("Values of A and B are not unique");

	}

}
