package practice;

import java.io.IOException;
import java.util.Scanner;
public class Array {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n = sc.nextInt();
		System.out.println("Array is being created with default values...");
		ArrayAction obj = new ArrayAction(n);
		int arr[] = obj.insertArray();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the value to be searched in the Array:");
		int k = sc.nextInt();
		int loc = obj.searchArray(k);
		if(loc==-1) {
			System.out.println("Value not found in the Array");
			}
		else {
			System.out.println(k+"\t is found at position \t"+(loc+1));
		}
		System.out.println("Enter the index at which you want to access the value:");
		int index = sc.nextInt();
		obj.accessArray(index);
		System.out.println("Enter the index at which you want to delete the value:");
		int del = sc.nextInt();
		obj.deleteArray(del);
		sc.close();
	}

}
