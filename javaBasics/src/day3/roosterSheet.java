package day3;
import java.util.Scanner;

public class roosterSheet {

	public static void main(String[] args) {
		int rollno;
		int mark1, mark2, mark3, sum;
		float percent;
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter roll number");
		rollno=s.nextInt();
		System.out.println("enter name");
		name=s.next();
		System.out.println("enter English marks");
		mark1=s.nextInt();
		System.out.println("enter Math marks");
		mark2=s.nextInt();
		System.out.println("enter Science marks");
		mark3=s.nextInt();
		sum=mark1+mark2+mark3;
		percent= (float) sum/3;
		System.out.println("roll number= " + rollno);
		System.out.println("name= " + name);
		System.out.println("English= " + mark1);
		System.out.println("Math= " + mark2);
		System.out.println("Science= " + mark3);
		System.out.println("total= " + sum);
		System.out.println("percentage= " + percent +"%");
		

	}

}
