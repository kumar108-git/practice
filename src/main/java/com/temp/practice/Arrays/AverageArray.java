package com.temp.practice.Arrays;

public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.print(getAverage(ar));
		
	}
	
	public static int getAverage(int[] arr) {
		int total = 0;
		int size = arr.length;
		for(int i=0;i <= size -1;i++) {
			total = total+arr[i];
		}
		return total/size;
	}

}
