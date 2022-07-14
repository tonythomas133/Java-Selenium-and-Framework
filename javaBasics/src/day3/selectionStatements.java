package day3;
import java.util.Scanner;
public class selectionStatements {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER a number");
		a=s.nextInt();
        if (a>0)
        {
        	System.out.println("Entered value is positive");
        }
        else
        {
        	System.out.println("Entered value is negitive");
        }
	}

}
