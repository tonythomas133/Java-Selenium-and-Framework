package day9;

import java.io.IOException;  //imported because we use throws IOException
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args ) throws IOException {
		
		/*try {
			int a=50/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace(); //to figure out which line has the exception
		} */
		try { //block of code is written here
			Scanner s= new Scanner(System.in);
			int age;
			age=s.nextInt();
			String str= null;
			//System.out.println(age);
			System.out.println(str.length());
		}
		catch(ArithmeticException e) {
			
		}
		catch(Exception e)
		{ //if exception occurs 
			e.printStackTrace();		
			}
		finally {
			//used to close exception, this block will be accessed if there is an exception or not. all class objects will be closed in this block
			//usually used when accessing other classes and data bases
			System.out.println("finally block is executed");
		}

		
			
		}
	protected void finalize(){
	}

}

//final keyword makes a variable or class immutable
//finally used with try and catch 
//finalize()  , garbage collector (closes all objects created in the code) SYNTAX protected void finalize(){}
