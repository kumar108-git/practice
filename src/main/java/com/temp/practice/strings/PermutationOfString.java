package com.temp.practice.strings;

import java.util.Scanner;

public class PermutationOfString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String s = scanner.nextLine().trim();
		permutation("", s);
		scanner.close();
	}
	
	public static void permutation(String p,String s){
		System.out.println("s length : "+s.length());
		System.out.println("p : "+p);	
		System.out.println("s : "+s);	
		if(s.length() == 0)
			System.out.println(p);
		for(int i=0; i < s.length(); i++){
			System.out.format("p value is : %s and s value is : %s and itertation %s \n",p,s,i);
			System.out.format("p : %s and char value is %s \n ",p+s.charAt(i),s.charAt(i));
			System.out.format("String first part of s is: %s and String second part of s is: %s and i is: %s  \n",s.substring(0, i),s.substring(i+1),i);
			permutation(p+s.charAt(i), s.substring(0, i)+s.substring(i+1));
			System.out.format("end of the loop with i value as %s \n",i);
			System.out.format("loop last p value is : %s and loop last s value is : %s and itertation %s \n",p,s,i);
		}
	}

}
