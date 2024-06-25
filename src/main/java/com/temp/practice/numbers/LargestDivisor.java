package com.temp.practice.numbers;

import java.util.Scanner;

public class LargestDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int output = getLargestDivisor(n);
		System.out.format("%s",output);

	}
	
	public static int getLargestDivisor(int n) {
		double d = Math.sqrt(n) ;
		for(int i=2; i <= Math.sqrt(n); i++) 
			if(n%i == 0) 
				return n/i;			
		return 1;
		
	}

}
