package com.temp.practice.strings;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.format("Count of vowels is: %s ",getCountVowels("HELLO"));

	}
	public static int getCountVowels(String st) {
		
		int count = 0;
		char[] vovels = {'a', 'e', 'i','o', 'u'};
		char[] stArry = st.toLowerCase().toCharArray();
		for(int i=0; i < vovels.length; i++) {
			int j=0;
			while(j < stArry.length) {
				if(vovels[i] == stArry[j]) {
					count += 1;
				}
				j++;
			}
		}
		
		return count;
	}

}
