package com.temp.practice.pattern;

/*
 * 	Write a Java Program to print the following Pattern

	1
	2 2
	3 3 3
	4 4 4 4
	5 5 5 5 5
	6 6 6 6 6 6
 */
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPattern1(6);
	}
	
	public static void getPattern1(int iLimit) {
		for (int i = 1; i <= iLimit; i++) {
			int z =i;
			for (int j = 1; j <= i; j++) {
				System.out.print(z+" ");
			}
			System.out.print("\n");
		}
	}

}
