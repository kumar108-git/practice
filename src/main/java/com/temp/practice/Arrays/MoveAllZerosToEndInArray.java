package com.temp.practice.Arrays;

import java.util.Arrays;

public class MoveAllZerosToEndInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1, 0, 4, 3, 0, 0, 2, 0, 1, 0};
//		System.out.println(Arrays.toString(getZerosMovedInArray(ar)));
		System.out.println(Arrays.toString(getArr(ar)));
	}
	
	public static int[] getZerosMovedInArray(int[] arr) {
		
		int arrLen = arr.length;
		int[] arrRt = new int[arrLen];
		int k=0;
		for(int i=0;i<arrLen;i++) {
			if(arr[i] != 0) {
				arrRt[k] = arr[i];
				k++;
			}
		}
		
		return arrRt;
	}
	
	public static int[] getArr(int[] arr) {
		int array[] = {1, 0, 4, 3, 0, 0, 2, 0, 1, 0};
		System.out.println("The Given Array is :: ");
		for(int v : array)
			System.out.print(v+" ");
		
		int count = 0;
		for(int i=0;i<array.length;i++)
			if(array[i] != 0)
				array[count++] = array[i];
		
		while(count < array.length)
			array[count++] = 0;
		
		System.out.println("\nAfter moving all zeros to end of array :: ");
		for(int v : array)
			System.out.print(v+" ");
		return arr;
	}

}
