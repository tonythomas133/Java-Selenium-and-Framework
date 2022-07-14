package day4;
import java.util.Scanner;
public class VowelsProgram {

	public static void main(String[] args) {
		char a, b;
		System.out.println("enter a character");
		Scanner s= new Scanner(System.in);
		a=s.next().charAt(0);
		b=Character.toLowerCase(a);
		switch(b) {
		case 'a': System.out.println("is a vowel"); break;
		case 'e': System.out.println("is a vowel"); break;
		case 'i': System.out.println("is a vowel"); break;
		case 'o': System.out.println("is a vowel"); break;
		case 'u': System.out.println("is a vowel"); break;
		default: System.out.println("is not a vowel"); break;
		}
		

	}

}
