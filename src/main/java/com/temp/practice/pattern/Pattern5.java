package com.temp.practice.pattern;

import java.util.ArrayList;

/*
 * 	Write a Java Program to print the following Pattern

	1
	1 2 1
	1 2 3 2 1
	1 2 3 4 3 2 1
	1 2 3 4 5 4 3 2 1
	1 2 3 4 5 6 5 4 3 2 1 
 */
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPattern1(10);
	}

	public static void getPattern1(int iLimit) {
		ArrayList<Integer> oddNList = getNListOfOddNumber(iLimit);
		for (int i = 0; i <= iLimit-1; i++) {
			int z = 1;
			for (int j = 1; j <= oddNList.get(i); j++) {
				System.out.print(z + " ");
				if(i < j) {
					z--;
				} else {
					z++;
				}
				
			}
			System.out.print("\n");
		}
	}

	public static ArrayList<Integer> getNListOfOddNumber(int limit) {
		int loopLimit = limit*2;
		ArrayList<Integer> oddNumList = new ArrayList<Integer>();
		int z = 1;
		for(int i=1; i<= loopLimit; i++) {
			if(i % 2 != 0 ) {
				oddNumList.add(i);
				z++;
			}	
				
		}
		return oddNumList;
	}

}
