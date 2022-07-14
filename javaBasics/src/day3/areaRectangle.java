package day3;
import java.util.Scanner;
public class areaRectangle {

	public static void main(String[] args) {
		int a, b, area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		a=s.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		b=s.nextInt();
		area=a*b;
		System.out.println("Area of the rectangle is " + area);

	}

}
