package com.temp.practice.Arrays;

import java.util.Arrays;

public class UnionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr_1 = {17, 23, 31, 14, 25, 26};
		int[] arr_2 = {23, 44, 14, 8, 17};
		System.out.println(Arrays.toString(getUnionOfBothArrays(arr_1,arr_2)));
	}
	
	public static int[] getUnionOfBothArrays(int[] arr_1,int[] arr_2) {
		
		int arr_1_len = arr_1.length;
		int arr_2_len = arr_2.length;
		int[] unionArr = new int[arr_1_len+arr_2_len]; 
		int count = 0;
		
		int index = arr_1_len;		
		
		//Add all elements of first array
		for(int i=0; i < arr_1_len; i++) {
			unionArr[i] = arr_1[i];
		}
		
		//Add unique elements which are not present in array_1 to union array
		for(int j=0; j < arr_2_len; j++) {
			int k = 0;
			while(k < unionArr.length) {
				if(arr_2[j] == unionArr[k]) {
					break;
				} else if (k == unionArr.length - 1) {
					unionArr[index++] = arr_2[j];
					break;
				} else {
					k++;
				}
				
			}
		}
		
		//removing trailing zeros
		for(int e : unionArr) {
			if(e == 0) {
				count++;
			}
		}
		
		int arrLen = unionArr.length - count;
		int[] rtArr = new int[arrLen];
		for(int z=0;z < rtArr.length; z++) {
			rtArr[z] = unionArr[z];
		}
		
		return rtArr;
	}
}
