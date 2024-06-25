package com.temp.practice.numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.format("%s",getPrimeNumber(input));
		sc.close();
		*/
		//print primeNumbers from 1 to 100
		for(int i=2; i < 100; i++)
			if(getPrimeNumber(i))
					System.out.format("%s \n",i);

				
	}
	
	public static boolean getPrimeNumber(int num) {
		
		int length = num/2;
		
		for(int i=2; i < length;i++)
			if( num % i == 0)
				return false;
			return true;
		
	}

}
