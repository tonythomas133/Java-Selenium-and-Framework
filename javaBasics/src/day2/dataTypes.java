package day2;

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
		ch='a';
		a=10;
		b=12;
		c=13;
		name="jaya";
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
