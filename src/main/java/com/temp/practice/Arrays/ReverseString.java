package com.temp.practice.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample = "good";
		char[] str = sample.toCharArray();
		int strleng = str.length - 1;
		String reverse = "";
		for(int i = strleng; i>=0; i--) {
			char strInt = str[i];
			reverse = reverse + String.valueOf(strInt);
		}
		System.out.print(reverse);
		
		
		

	}

}
