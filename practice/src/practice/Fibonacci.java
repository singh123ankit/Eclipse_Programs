package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args)throws IOException {
		int a;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number:\t");
		a = Integer.parseInt(br.readLine());
		System.out.println("Factorial="+fibo(a));

	}
	public static int fibo(int n) {
		if(n==1 || n==2)
			return n-1;
		return fibo(n-1)+fibo(n-2);
	}
}
