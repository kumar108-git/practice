package com.temp.practice.numbers;

public class FindTheSmallestWithOutComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSmallestWithOutComparator(12, 9, 2));

	}
	
	public static int getSmallestWithOutComparator(int a,int b,int c) {
		
		int intSmallest1 = 0;
		int intSmallest2 = 0;
		int smallest = 0;
		
		if(a/b == 0) {
			intSmallest1 = a;
		} else {
			intSmallest1 = b;
		}
		if(b/c == 0) {
			intSmallest2 = b;
		} else {
			intSmallest2 = c;
		}
		
		if(intSmallest1/intSmallest2 == 0) {
			smallest = intSmallest1;
		} else {
			smallest = intSmallest2;
		}
		
		return smallest;
	}

}
