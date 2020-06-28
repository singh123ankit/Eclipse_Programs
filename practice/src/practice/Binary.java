package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Binary {

	public static void main(String[] args)throws IOException {
		System.out.println("Enter the Size of Array:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		System.out.println("Enter the elements in the arary:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int k=0,l=arr.length-1;
		System.out.println("Enter the value to be searched:");
		int value = Integer.parseInt(br.readLine());
		binarySearch(arr,value,k,l);
	}
	public static void binarySearch(int arr[],int value,int start,int end) {
		int mid = (start+end)/2;
		if(start==end) {
			if(arr[start]==value) {
				System.out.println("The value"+value+"is found at"+start);
				return;
			}
			else {
				System.out.println("Value is not found at specified position");
				return;
			}
		}
		else if(arr[mid]==value){
			System.out.println("The value"+value+"is found at"+mid);
		}
		else {
			if(value>arr[mid]) {
				start = mid+1;
			}
			if(value<arr[mid]) {
				end = mid-1;
			}
			binarySearch(arr,value,start,end);
		}
	}

}
