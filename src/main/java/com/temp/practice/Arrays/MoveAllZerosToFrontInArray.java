package com.temp.practice.Arrays;

import java.util.Arrays;

public class MoveAllZerosToFrontInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1, 0, 4, 3, 0, 0, 2, 0, 1, 0};
		System.out.println(Arrays.toString(getAllZerosToFrontInArray(ar)));
	}
	
	public static int[] getAllZerosToFrontInArray(int[] arr) {
		
		int count= 0;
		int[] tempArr = null;
		int k = 0;
		int arLen = arr.length;
		for(int i=0; i < arLen ; i++) {
			if(arr[i] != 0) {				
				count++;
			}
		}
		if(count > 0) {
			tempArr = new int[count];
		}
		
		for(int v: arr) {
			if(v !=0) {
				tempArr[count-1]= v;
				count--;
			}
		}
		
		for(int j=arLen -1; j >= 0 ; j--) {
			if(k < tempArr.length) {
				arr[j] = tempArr[k];
				k++;
			} else {
				arr[j] = 0;
			}
			
		}
		
		
		
		return arr;
	}

}
