package day5;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		int i=1, limit;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the limit");
		limit=s.nextInt();
		while(i<limit+1) {
			System.out.println(i +" hello world");
			i++;
		}
		
	}

}
