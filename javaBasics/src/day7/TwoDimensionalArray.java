package day7;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int row, column, row1, column1;
		int [][] matrix;
		int [][] matrix1;
		int [][] matrix2;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number of rows");
		row=s.nextInt();
		System.out.println("enter the number of columns");
		column=s.nextInt();
		System.out.println("this is a "+ row + " X " + column + " matrix");
		matrix= new int[row][column];
		System.out.println("enter the values of the matrix");
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				matrix[i][j]=s.nextInt();
			}
		}
		
		
		System.out.println("enter the details of the next matrix");
		System.out.println("enter the number of rows");
		row1=s.nextInt();
		System.out.println("enter the number of columns");
		column1=s.nextInt();
		System.out.println("this is a "+ row1 + " X " + column1 + " matrix");
		matrix1= new int[row1][column1];
		System.out.println("enter the values of the matrix");
		for (int i=0; i<row1; i++) {
			for (int j=0; j<column1; j++) {
				matrix1[i][j]=s.nextInt();
			}
		}
		System.out.println("matrix 1 is:");
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("matrix 2 is :");
		for (int i=0; i<row1; i++) {
			for (int j=0; j<column1; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
		if(row==row1 && column==column1) {
			
			for(int i=0; i<row; i++) {
				for(int j=0; j<column; j++) {
					matrix2[i][j]=matrix[i][j] + matrix1[i][j];
				}
			}
			System.out.println("the sum of the matrices is as follows");
			for(int i=0; i<row; i++) {
				for(int j=0; j<column; j++) {
					System.out.println(matrix2[i][j] + " ");
					
				}
				System.out.println();
			}
			
		}
		else {
			System.out.println("the addition operation cannot be done as dimensions of the 2 matrices are not equal");
		}
		
	}

}
