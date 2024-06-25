package com.temp.practice.pattern;

/*
 * 	Write a Java Program to print the following Pattern

	6 5 4 3 2 1
	6 5 4 3 2 
	6 5 4 3 
	6 5 4
	6 5
	6
 */
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPattern1(6);
	}
	
	public static void getPattern1(int iLimit) {
		for (int i = iLimit; i >= 0; i--) {
			int z =iLimit;
			for (int j = 1; j <= i; j++) {
				System.out.print(z+" ");
				z--;
			}
			System.out.print("\n");
		}
	}

}
