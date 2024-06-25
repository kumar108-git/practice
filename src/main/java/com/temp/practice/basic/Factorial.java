package com.temp.practice.basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		System.out.format("Factorial of number %s is : %s"
//				, num,getFactorialOfNumber(num));
		System.out.format("Factorial of number %s is : %s"
				, num,getFactorial(num));
		
		sc.close();
	}
	public static int getFactorialOfNumber(int n) {
		int factorial = 1;
		for(int i=1; i <= n ; i++)
			factorial = factorial *i;		
		return factorial;
	}
	
	public static int getFactorial(int n) {
		if(n==1)
			return 1;
		return n * getFactorial(n-1);
	}
	
}
