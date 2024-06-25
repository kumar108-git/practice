package com.temp.practice.pattern;

import java.util.ArrayList;

/*
 * 	Write a Java Program to print the following Pattern

	1 2 3 4 5 6 
	  2 3 4 5 6 
	    3 4 5 6 
	      4 5 6 
	        5 6 
	          6 
	        5 6 
	      4 5 6 
	    3 4 5 6 
	  2 3 4 5 6 
	1 2 3 4 5 6 
 */
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPattern1(10);
	}

	public static void getPattern1(int iLimit) {
		for(int i=1;i<=iLimit;i++){
			for(int k=1;k<i;k++)
				System.out.print("  ");
			for(int j=i;j<=iLimit;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		for(int i=iLimit-1; i>=1; i--){
			for(int k=1;k<i;k++)
				System.out.print("  ");	
			for(int j=i;j<=iLimit;j++)
				System.out.print(j+" ");
					
			System.out.println();
		}
		
	}

}
