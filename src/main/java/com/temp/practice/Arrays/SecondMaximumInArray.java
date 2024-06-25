package com.temp.practice.Arrays;

public class SecondMaximumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {10,20,30,40,50,60,70,80};
		System.out.print(getSecondMaxInArray(ar));

	}
	
	public static int getSecondMaxInArray(int[] arr) {
		
		int firstMax = 0;
		int secondMax = 0;
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > firstMax ) {
				firstMax = arr[i];
			}
		}// for
		
		for(int j=0; j < arr.length; j++) {
			if(arr[j] < firstMax) {
				if(arr[j] > secondMax) {
					secondMax = arr[j];
				}
			}
		}
		
		
		return secondMax;
		
	}

}
