package practice;

import java.io.*;

public class Factorial {

	public static void main(String[] args)throws IOException {
		int a;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number:\t");
		a = Integer.parseInt(br.readLine());
		System.out.println("Factorial="+fact(a));
	}
	public static int fact(int n) {
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
}
