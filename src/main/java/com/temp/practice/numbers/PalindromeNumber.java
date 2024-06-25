package com.temp.practice.numbers;

import com.temp.practice.Arrays.ReverseString;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.format("%s", getPalindromeNumber(100));
		for(Integer i=1000; i <=10000; i++) {
			if(getPalindromeNumber(i))
				System.out.println(i+ " is a Palindrome");
		}
	}
	
	public static boolean getPalindromeNumber(Integer num) {
		
		String numStr = String.valueOf(num);
		char[] numArr = numStr.toCharArray();
		char[] reverseNum = new char[numArr.length];
		int j = 0;
		String reverseNumStr =null;
		for(int i=numArr.length -1; i >= 0; i--) {
			reverseNum[j] = numArr[i];
			j++;
		}
		
		if(reverseNum.length > 0) {
			reverseNumStr = String.valueOf(reverseNum);
		}
		if(Integer.valueOf(reverseNumStr).equals(Integer.valueOf(numStr))) {
			return true;
		} else {
			return false;
		}
		
	}

}
