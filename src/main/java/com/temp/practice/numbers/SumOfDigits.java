package com.temp.practice.numbers;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSumOfDigits(1000));
	}
	public static int getSumOfDigits(int digit) {
		
		int sumDigit = 0;
		int tempDigit = digit;
		
		while(tempDigit > 0) {
			int unitDigit = tempDigit % 10;
			sumDigit += unitDigit;
			tempDigit = tempDigit/10;
		}
		
		return sumDigit;
	}
}
