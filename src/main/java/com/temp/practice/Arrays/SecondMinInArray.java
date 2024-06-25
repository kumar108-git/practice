package com.temp.practice.Arrays;

public class SecondMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {10,20,30,40,50,60,70,80};
		System.out.print(getSecondMinInArray(ar));
	}
	
	public static int getSecondMinInArray(int[] arr) {
		
		int firstMin = 0;
		int secondMin = 0;
		int firstMinPos = 0;
		
		for(int i=0; i < arr.length; i++) {
			if((firstMin < arr[i]) && (i == 0)) {
				firstMin = arr[i];
			}// if
			if((arr[i] < firstMin) &&( i != 0) ){
				firstMin = arr[i];
				firstMinPos = i;
			} 
		}
		
		if((arr.length - 1) == firstMinPos) {
			secondMin = arr[firstMinPos - 1];
		} else {
			secondMin = arr[firstMinPos+1];
		}
		
		for(int j=0; j < arr.length; j++) {
			if(secondMin < arr[j]) {
				
			} else if(firstMin < arr[j]) {
				secondMin = arr[j];
			}
		}
		
		
		
		return secondMin;
		
	}
	
}
