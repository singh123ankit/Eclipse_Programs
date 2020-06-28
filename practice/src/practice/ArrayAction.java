package practice;

import java.io.IOException;
import java.util.Scanner;

public class ArrayAction {
	int[] arr;
	public ArrayAction(int a) {
		arr = new int[a];
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public int[] insertArray()throws IOException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements in array...");
		for(int j=0;j<arr.length;j++) {
			arr[j]=sc.nextInt();
		}
		return arr;
	}
	public int searchArray(int k) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k)
				return i;
		}
		return -1;
	}
	public void accessArray(int index) {
		try {
			if(arr[index]==Integer.MIN_VALUE) {
				System.out.println("The specified cell is empty");
				return;
			}
			System.out.println("Value at Index\t "+index+"\tis\t"+arr[index]);
		}
		catch(Exception ae) {
			System.out.println("Array Index Out Of Bounds");
		}
	}
	public void deleteArray(int del) {
		
		try {
			if(arr[del-1]==Integer.MIN_VALUE) {
				System.out.println("The specified cell is already empty");
				return;
			}
			arr[del-1]=Integer.MIN_VALUE;
			for(int l=0;l<arr.length;l++) {
				System.out.println(arr[l]+" ");
			}
		}
		catch(Exception ae) {
			System.out.println("Array Out Of Bounds");
		}
	}

}
