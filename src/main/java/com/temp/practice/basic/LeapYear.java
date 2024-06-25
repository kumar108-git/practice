package com.temp.practice.basic;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(isLeapYear(year)) {
			System.out.format("%s year is a leap year", year);
		} else {
			System.out.format("%s is not a leap year", year);
		}	
		
		sc.close();
	}
	
	public static boolean isLeapYear(int year) {		
		if((year % 4 == 0) && (year % 100 != 0) ||(year % 400 == 0)) {			
			return true;			
		} else {
			return false;
		}
	}

}
