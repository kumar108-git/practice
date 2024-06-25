package com.temp.practice.strings;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(countWords("I am a good programmer  "));
		System.out.format("number of words in a given string is : %s",getWordCount("I am a good programmer  "));
	}
	
	public static int getWordCount(String strng) {
		int count = 0;
		String[] stArr = strng.split("\\s");
		if(strng.length() == 0)
			return count;
		return stArr.length;
	}
	private static int countWords(String str){
		int len = str.trim().length();
		int count = 1;
		for(int i=0;i<len;i++){
			char ch = str.charAt(i);
			System.out.println(ch);
			if(ch == ' ' || ch == '\t' || ch == '\n'){
				count++;
				ch = str.charAt(i+1);
				
				while(ch == ' ' || ch == '\t' || ch == '\n'){
					i++;
					if((i+1) == len ) {
						break;
					} else {
						ch = str.charAt(i+1);
					}
						
					//this while loop removes continuous white spaces					 
				}
			}
		
		}
		return count;
	}
		
}


