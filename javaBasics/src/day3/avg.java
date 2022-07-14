package day3;
import java.util.Scanner;
public class avg {

	public static void main(String[] args) {
		int a, b, c;
		float avg;
		Scanner s=new Scanner(System.in);
  		System.out.println("Enter 1st number");
		a=s.nextInt();
  		System.out.println("Enter 2st number");
		b=s.nextInt();
  		System.out.println("Enter 3st number");
		c=s.nextInt();
		avg = (float)(a+b+c)/3;
		System.out.println("average is " + avg);
	}

}
