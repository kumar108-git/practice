package com.temp.practice.pattern;

/*
 * 	Write a Java Program to print the following Pattern

	1 2 3 4 5 6
	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2
	1
 */
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPattern1(6);
	}
	
	public static void getPattern1(int iLimit) {
		for (int i = iLimit; i >= 0; i--) {
			int z =1;
			for (int j = 1; j <= i; j++) {
				System.out.print(z+" ");
				z++;
			}
			System.out.print("\n");
		}
	}

}
