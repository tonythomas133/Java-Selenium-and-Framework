package day5;
import java.util.Scanner;
public class SumOfAllNumbers {

	public static void main(String[] args) {
		//sum of the number
		//string input s.nextLine() abc.length()
		int i, a, d=0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number");
        a=s.nextInt();
        for(i=0; i<=a; i++) {
        	d=i+d;
        	
        }
        System.out.println("total " + d);
	}

}
