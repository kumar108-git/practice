package com.temp.practice.numbers;

import java.util.ArrayList;

public class SmithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print smith numbers upto 100
//		getSmithNumbersUnitlN(100);
		if(getSmithNumber(25))
			System.out.println("is a smith number");
			System.out.println("is not a smith number");
		
	}	
	
	public static boolean getSmithNumber(int num){
		int limit = num/2;
		int numSum =0;
		int pfSum = 0;
		int tempNum = num;
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=2; i <= limit; i++) {
			while(tempNum % i == 0) {
				al.add(i);
				tempNum = tempNum/i;
			}
		}
		
		for(int a : al) {
			pfSum += getDigitSum(a);
		}
		
		numSum = getDigitSum(num);
		
		
		if(pfSum == numSum)
			return true;		
		return false;
		
	}
	
	private static int getDigitSum(int digit) {
		int digitSum = 0;
		while( digit % 10 != 0) {
			int uDigit = digit % 10;
			digitSum += uDigit;
			digit = digit/10;
		}
		
		return digitSum;
	}
	
	public static void getSmithNumbersUnitlN(int limit) {
		for(int i=2; i < limit; i++) {
			if(getSmithNumber(i))
				System.out.format("%s : is a smith number \n",i);
			
//				System.out.format("%s : is not a smith number \n",i);
			
				
			
			
		}
	}
	
}