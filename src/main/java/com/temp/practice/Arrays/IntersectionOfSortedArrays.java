package com.temp.practice.Arrays;

import java.util.Arrays;

public class IntersectionOfSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar_1 = {44, 49, 30, 25, 67, 69};
		int[] ar_2 = {88, 44, 69, 93, 30};
		System.out.println(Arrays.toString(getIntersectionElementsInBothArrays(ar_1, ar_2)));
	}
	
	public static int[] getIntersectionElementsInBothArrays(int[] ar1,int[] ar2) {
		
		int firstArLen = ar1.length;
		int secondArLen = ar2.length;
		int[] rtArr = new int[firstArLen];
		int k = 0;
		for(int i=0; i < firstArLen; i++) {
			int j=0;
			while(j < secondArLen) {
				if(ar1[i] == ar2[j]) {
					rtArr[k] = ar1[i];
					k++;
				}
				j++;
			}
		}
		
				
		return rtArr;
	}

}
