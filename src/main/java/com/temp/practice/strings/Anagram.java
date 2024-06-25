package com.temp.practice.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String 1 : ");
		String st1 = sc.nextLine().strip();
		System.out.format("You have entered the first string as %s \n", st1);
		System.out.println("Enter First String 2 : ");
		String st2 = sc.nextLine().strip();
		System.out.format("You have entered the second string as %s \n", st2);
		sc.close();
		if(isStringsAnagram(st1, st2)) {
			System.out.format("%s and %s are anagram \n",st1,st2);
		} else {
			System.out.format("%s and %s are not anagram \n",st1,st2);
		}
			
			
	}
	
	public static boolean isStringsAnagram(String str1,String str2) {
		
		char[] strCharArr1 = str1.toCharArray();
		char[] strCharArr2 = str2.toCharArray();
		
		Arrays.sort(strCharArr1);
		Arrays.sort(strCharArr2);
		
		if(Arrays.equals(strCharArr1,strCharArr2))
			return true;		
			return false;
	}

}
