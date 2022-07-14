package day3;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		int n1, n2, sum, diff, mod, mult;
		Scanner s=new Scanner(System.in);
		float quot;
		System.out.println("Enter First number");
		n1= s.nextInt();
		System.out.println("Enter Second number");
		n2= s.nextInt();
		sum=n1+n2;
		diff= n1-n2;
		quot=n2/n1;
		mod=n2%n1;
		mult=n2*n1;
		System.out.println("sum = "+ sum);
		System.out.println("diff = "+ diff);
		System.out.println("quot = "+ quot);
		System.out.println("mod = "+ mod);
		System.out.println("mult = "+ mult);
	}

}
