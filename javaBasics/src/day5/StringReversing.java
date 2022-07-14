package day5;
import java.util.Scanner;
public class StringReversing {

	public static void main(String[] args) {
		int len;
		Scanner s= new Scanner(System.in);
		String str;
		System.out.println("Enter a string to be reversed");
		str=s.next();
		len= str.length();
		System.out.println("the string is " + str);
		for(int i=(len-1); i>=0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}
