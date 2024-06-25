package com.temp.practice.Arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		int rotate = 3;
		System.out.println(rtArray(arr,rotate));

	}
	
	public static String rtArray(int[] ar, int num) {
		int size = ar.length;
		int[] newAr = new int[size];
		int arStartIndex = (size - num);
		int arNewIndex = (size - num);
		for(int i=0; arStartIndex <= size - 1; i++) {
			newAr[i] = ar[arStartIndex];
			arStartIndex += 1;
		}
		for(int j=num; j <= size - 1;) {
			for(int k=0; k <= arNewIndex -1; k++) {
				newAr[j] = ar[k];
				j++;
			}
		}
		return Arrays.toString(newAr);
		
	}

}
