package com.temp.practice.basic;

import java.util.ArrayList;

public class DigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getDigitsOfNumber(2019);
	}
	
	public static void getDigitsOfNumber(int num) {
		if(num >0) {
			int tempNum = num;
			ArrayList<Integer> digitsList = new ArrayList<>();
			while(tempNum > 0) {
				int uDigit = tempNum % 10;
				digitsList.add(0, uDigit);
//				System.out.print(uDigit);
				tempNum = tempNum /10;
			}
			
			for(Integer z : digitsList) {
				System.out.format("%s, ", z);
			}
		}
	}

}
