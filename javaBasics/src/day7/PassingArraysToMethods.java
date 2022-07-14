package day7;

import java.util.Scanner;

public class PassingArraysToMethods {
static int sum=0;
public static int arraySum(int arr[]) {
	System.out.println("the length of the array is " + arr.length);
	for(int j=0; j<arr.length; j++) {
		sum= sum+arr[j];
	}
	return sum;
}
	public static void main(String[] args) {
	int size, i;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the size of the array");
	size=s.nextInt();
	int a[]= new int[size];
	System.out.println("enter the valuse of the array");
	for(i=0; i<size; i++ ) {
	a[i]=s.nextInt();
	}
	System.out.println("the array is ");
	for(i=0; i<size; i++) {
		System.out.println(a[i]);
	}
	System.out.println("the sum is" + arraySum(a)); //the array a[] is passed to the method arraySum
	
}
}
