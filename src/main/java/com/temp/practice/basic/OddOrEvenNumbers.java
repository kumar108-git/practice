package com.temp.practice.basic;

public class OddOrEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEvenOrOddNumbersUntilLimt(10,"odd");
	}
	
	public static boolean isGivenNumberOddOrEven(int num) {
		if(num >= 0) {
			if(num == 0) {
				return true;
			} else if(num == 1) {
				return false;
			}
			num = num - 2;
			isGivenNumberOddOrEven(num);
		}
		return false;
	}
	
	private static void printEvenOrOddNumbersUntilLimt(int limit, String evenOrOdd) {
		for(int i=1; i<= limit; i++) {
			if(i%2 == 0 ) {
				if(evenOrOdd.toLowerCase().equals("even"))
					System.out.format("%s is even \n", i);
			} else {
				if(evenOrOdd.toLowerCase().equals("odd"))
					System.out.format("%s is odd \n", i);
			}
				
			
		}
	}
}