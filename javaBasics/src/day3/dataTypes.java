package day3;
import java.util.Scanner;
public class dataTypes {

	public static void main(String[] args) {
		/* DATA TYPES
		Primitive Data types
		int
		long
		float
		double
		char 
		boolean 
		short 
		byte 
		 */
		int a,b,c;
		String name;
		float average;
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a character");
		ch=s.next().charAt(0);
		System.out.println("enter 1st number");
		a=s.nextInt();
		System.out.println("enter 2nd number");
		b=s.nextInt();
		System.out.println("enter 3rd number");
		c=s.nextInt();
		System.out.println("enter a name");
		name=s.next();
		average= (float)(a+b+c)/3;


		/*Syntax
		eg:		datatype variablename,var2,var3...;

		=	assignment operator
		

		Arithmetic operators 

		 + 	addition
		 -	subtraction
		 *	multiplication
		 /  division
		%   modulus(reminder)  */
		System.out.println(name);
		System.out.println("The character is " + ch);
		System.out.printf("The 3 integer values are %s %s %s\n",a,b,c);
		System.out.println(average);
	}

}
