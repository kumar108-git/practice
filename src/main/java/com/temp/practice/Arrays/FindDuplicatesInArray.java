package com.temp.practice.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] ar = {6,2,3,4,2,5,6,3,4};
		System.out.print(getDuplicateElements(ar));
		*/
		HashSet<Integer> set = new HashSet<>();
//		int arr[] = {2, 2, 2, 2, 1, 3};
		int[] arr = {6,2,3,4,2,5,6,3,4};
		for(int i =0;i<arr.length;i++){
//			System.out.println("array at position :"+ i +"is "+arr[i]);
//			System.out.println("math abs of position "+Math.abs(arr[i]));
//			System.out.println(arr[Math.abs(arr[i])]);
			if(arr[Math.abs(arr[i])] > 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else{
				set.add(Math.abs(arr[i]));
			}
		}
		System.out.println("All duplicates are :: "+set);
	
	}
	
	public static String getDuplicateElements(int[] arr) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		Integer[] unique;
		int[] duplicates = new int[arr.length];
		
		for(int el: arr) {
			set.add(el);
		}
		
		unique= set.toArray(new Integer[set.size()]);
		
		for(int i=0; i<= unique.length - 1; i++) {
			int count = 0;
			for(int j=0; j <= arr.length -1; j++) {
				if(unique[i] == arr[j]) {
					count = count +1;
				}
				if((count >= 2) && (unique[i] == arr[j])) {
					duplicates[i] = arr[j];
				}
			}
		}
		
		
		return Arrays.toString(duplicates);
	}

} 
