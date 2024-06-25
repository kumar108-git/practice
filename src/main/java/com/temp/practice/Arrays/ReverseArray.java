package com.temp.practice.Arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(getReverseArray(ar)));

	}
	
	public static int[] getReverseArray(int[] arr) {
		
		int loopLen = arr.length/2;
		int arLen = arr.length;
		int k =1;
		for(int i=0; i< loopLen; i++) {
			int swapFirstCnd = arr[i];
			int swapSecndCnd = arr[arLen - k];
			arr[i] = swapSecndCnd;
			arr[arLen - k] = swapFirstCnd;
			k++;
		}
		
		return arr;
		
	}

}
