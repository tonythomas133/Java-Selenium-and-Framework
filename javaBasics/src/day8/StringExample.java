package day8;

public class StringExample {

	public static void main(String[] args) {
		char a[] = {'h','e','l','l','o'};
		System.out.println(a);
		String str= "hello world"; //string literal    string pool is used , which means thatif the same value is given to different variables , it will only reference the first value to the next variable
		System.out.println(str);
		String str1 = new String(); //string object   this method helps us to create variables with the same values in different variables
	}

}
