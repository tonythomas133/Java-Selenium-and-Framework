package day5;
import java.util.Scanner;
public class LoopExample {

	public static void main(String[] args) {
		int i, limit;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the value for limit");
		limit=s.nextInt();
		for(i=0; i<limit; i++) {  //SYNTAX for(initialization; condition; updation) {}
			System.out.println("hello world");
		}
		
	}

}
