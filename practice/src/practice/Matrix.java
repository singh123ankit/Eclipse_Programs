package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {

	public static void main(String[] args)throws IOException {
		int row1,col1,row2,col2;
		int[][] arr1,arr2;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no. of rows in 1st array:");
		row1 = Integer.parseInt(br.readLine());
		System.out.println("Enter no. of columns in 1st array:");
		col1 = Integer.parseInt(br.readLine());
		System.out.println("Enter no. of rows in 2nd array");
		row2 = Integer.parseInt(br.readLine());
		System.out.println("Enter no. of columns of 2nd array:");
		col2 = Integer.parseInt(br.readLine());
		arr1 = new int[row1][col1];
		arr2 = new int[row2][col2];
		System.out.println("Enter elements in 1st array:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Enter elements in 2nd array:");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j]=Integer.parseInt(br.readLine());
			}
		}
		MatrixMultiply mx = new MatrixMultiply();
		mx.multiply(arr1,arr2,row1,col1,row2,col2);
	}

}
