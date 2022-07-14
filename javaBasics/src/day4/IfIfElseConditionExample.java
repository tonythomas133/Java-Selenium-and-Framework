package day4;
import java.util.Scanner;
public class IfIfElseConditionExample {

	public static void main(String[] args) {
		int age;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age:");
		age=s.nextInt();
		if(age==1) {
			System.out.println("you are a minor");
		}
		else if(age>18 && age<50) {
			System.out.println("you are between 18 and 50");
		}
		else {
			System.out.println("you are not allowed");
		}
	}

}
