package com.temp.practice.strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isStringPalindrome("java"));
		
	}
	public static boolean isStringPalindrome(String str) {
		
		char[] charStrArr = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		if(str.length() > 0) {
			for(int i=charStrArr.length-1; i>=0; i--) {
				sb.append(charStrArr[i]);
			}
			System.out.println(sb);
			if(sb.toString().equals(str))
				return true;
			return false;
		} else {
			return false;
		}
	}
}
