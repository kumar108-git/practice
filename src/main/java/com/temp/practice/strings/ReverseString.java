package com.temp.practice.strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getReverseString("java"));
	}
	public static String getReverseString(String str) {
		
		String revStr = "";
		if(str.length() > 0) {
			char[] charStrArr = str.toCharArray();
			for(int i=charStrArr.length-1; i >= 0 ; i--) {
				revStr += charStrArr[i];
			}
		}
		
		return revStr;
	}
}
