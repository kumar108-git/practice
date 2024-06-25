package com.temp.practice.pattern;

import java.util.ArrayList;

/*
 * 	Write a Java Program to print the following Pattern

	1 2 3 4 5 6
	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2 
	1 
	1 2
	1 2 3 
	1 2 3 4 
	1 2 3 4 5
	1 2 3 4 5 6 
 */
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPattern1(10);
	}

	public static void getPattern1(int iLimit) {
		for (int i = iLimit; i >= 0; i--) {
			int z = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(z + " ");
				z++;
			}
			if(i != 0)
				System.out.print("\n");			
		}
		for (int i = 2; i <= iLimit; i++) {
			int z = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(z + " ");
				z++;
			}
			System.out.print("\n");			
		}
	}

}
