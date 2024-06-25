package com.temp.practice.strings;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSwapTwoStrings("generated","method");
	}
	
	public static void getSwapTwoStrings(String str1,String str2) {
		System.out.format(" String 1 is : %s \n String 2 is : %s before the swap \n"
				, str1,str2);
		int str1Len = str1.length();
		String combStr = str1+str2;
		
		str1 = combStr.substring(str1Len);
		str2 = combStr.substring(0, str1Len);
		System.out.format(" String 1 is : %s \n String 2 is : %s after the swap "
				, str1,str2);
		
		
	}

}
