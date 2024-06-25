package com.temp.practice.Arrays;

import java.util.Arrays;

public class FindFrequentNumberBySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 1, 2, 2, 1, 3};
		System.out.println(getFrequentNumberBySort(arr));
	}
	
	public static String getFrequentNumberBySort(int[] arr) {
		
		Arrays.sort(arr);
		
		int element = 0;
		int maxCount = 0;
		
		for(int i=0; i< arr.length;i++) {
			int count=1;
			while( i+1 < arr.length && arr[i+1] == arr[i]) {
				count = count +1;
				i++;
			}
			
			if(maxCount < count) {
				maxCount = count;
				element = arr[i];				
			}
		}
		
		return "Element :"+element+" has repeated " +maxCount+ " times in the given Array";
	}

}
