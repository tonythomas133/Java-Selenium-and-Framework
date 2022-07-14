package day6;
import java.util.Scanner;
abstract class Sum {
	abstract int sum(int a);
}

public class SumOfNumberAbstraction extends Sum{
	int sum(int a) {
		int d=0;
		for (int i=0; i<a; i++) {
			d=i+d;
		}
		return d;
	}

	public static void main(String[] args) {
		int x, y;
		Sum obj= new SumOfNumberAbstraction();
		Scanner s= new Scanner(System.in);
		System.out.println("enter the limit");
		x=s.nextInt();
		y=obj.sum(x);
		System.out.println("the sum is " + y);

	}

}
