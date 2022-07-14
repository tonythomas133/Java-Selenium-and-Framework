package day7;

import java.util.Scanner;

public class ArrayExample { //array is a collection of data of the same data type
//SYNTAX: 
//double [] arrayRefVar ={1.9,2.9,3.4,3.5};
//double [] myList = new double[4];

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int count=0;
		int x[];
		int i;
		int limit;
		System.out.println("enter the limit of array");
		Scanner s= new Scanner(System.in);
		limit=s.nextInt();
		x= new int[limit];
		int [] b; //another array declaration 
		int num[]= new int[5];
		byte byteArray[];
		short shortsArray[];
		boolean booleanArray[];
		long longArray[];
		float floatAray[];
		System.out.println("enter the values of the array");
		for(i=0; i<limit; i++) {
			x[i]=s.nextInt();
		}
		System.out.println("the array is");
		for(i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
		for(i=0; i<x.length; i++) {
			count= count+x[i];
		}
		System.out.println("the sum of the array is " + count);
	}

}
