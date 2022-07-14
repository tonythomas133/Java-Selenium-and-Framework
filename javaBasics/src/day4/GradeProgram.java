package day4;
import java.util.Scanner;
public class GradeProgram {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a;
		System.out.println("Enter your marks in percentage");
		a=s.nextInt();
		if(a<50) {
			System.out.println("D grade");
		}
		else if(a>=50 && a<60) {
			System.out.println("C grade");
		}
		else if(a>=60 && a<70) {
			System.out.println("B grade");
		}
		else if(a>=70 && a<80) {
			System.out.println("A grade");
		}
		else if(a>=80 && a<100) {
			System.out.println("A+ grade");
		}
		else {
			System.out.println("Please enter a valid percentile");
		}
	}

}
