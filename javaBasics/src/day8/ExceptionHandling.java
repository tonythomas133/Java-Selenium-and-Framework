package day8;

public class ExceptionHandling { //2type checked(run time) and unchecked (compile time)
//exception are inturuption in the flow of the program eg; file not found class not found,
	public static void main(String[] args) {
		int a=50/0; //ArechmeticException
		String s=null;
		System.out.println(s.length()); //NullPopinterException
		String str="abc";
		int i= Integer.parseInt(str); //NumberFormatException
		String strr="abc";
		
		//try catch is the method used for exception

	}

}
