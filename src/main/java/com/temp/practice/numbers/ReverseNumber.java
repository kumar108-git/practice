package com.temp.practice.numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse(785);
	}
	
	public static int reverse(int num){
		int reversedNum = 0;
		while( num > 0){
			int unitDigit = num % 10;
			reversedNum = (reversedNum * 10) + unitDigit;
			num = num / 10;
		}
		return reversedNum;
	}


}
