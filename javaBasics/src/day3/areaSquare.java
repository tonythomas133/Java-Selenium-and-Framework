package day3;
import java.util.Scanner;
public class areaSquare {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the dimension of the square");
		a=s.nextInt();
		int area=a*a;
		System.out.println("Area of the square is " + area);

	}

}
