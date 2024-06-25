package com.temp.practice.strings;

public class CombinationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getCombinationOfStrings("ABCD");
		getCombinationsOfString("",0,"ABC");

	}
	public static void getCombinationOfString(String str) {
		
		if(str.length() > 0) {
			char[] charArrOfStr = str.toCharArray();
			for(int i=0; i < charArrOfStr.length; i++) {
				for(int j=i+1; j < charArrOfStr.length; j++) {
					System.out.format("%s%s \n", charArrOfStr[i],charArrOfStr[j]);
				}				
			}
			for(int i=charArrOfStr.length -1; i >= 0; i--) {
				for(int j=i-1; j >= 0 ; j--) {
					System.out.format("%s%s \n", charArrOfStr[i],charArrOfStr[j]);
				}				
			}
		}
	}
	//ABCD
	public static StringBuffer getCombinationOfStrings(String st) {
		int stLimit =st.length();
		StringBuffer sb = new StringBuffer();
		if( stLimit > 0) {
			for(int i=0; i < st.length() ;i++ ) {
				int j=0;
				while(j <= stLimit -1) {
					System.out.format("%s%s \n", st.charAt(i),st.charAt(j));
					j++;
				}
			}
		}
		return sb;
	}
	
	public static void getCombinationsOfString(String comb,int curentIdx,String s) {
		for( int i=curentIdx; i< s.length();i++) {
			System.out.format("currentIndex: %s , comb string: %s ,index i: %s \n", curentIdx,comb,i);
			System.out.println(comb+s.charAt(i));
			getCombinationsOfString(comb+s.charAt(i),i+1,s);
			
		}
	}
	
}
