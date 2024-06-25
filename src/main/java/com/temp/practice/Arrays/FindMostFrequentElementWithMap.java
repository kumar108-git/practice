package com.temp.practice.Arrays;

import java.util.Hashtable;

public class FindMostFrequentElementWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {2, 1, 2, 2, 1, 3};
		System.out.print(getMostFrequentElementWithMap(ar));
	}
	
	public static String getMostFrequentElementWithMap(int[] arr) {
		
		Hashtable<Integer,Integer> map = new Hashtable<>();
		int max_occurance = 0;
		int output = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			} else{
				map.put(arr[i], 1);
			}
			int val = map.get(arr[i]);
			if(max_occurance < val) {
				max_occurance = val;
				output = arr[i];
			}
		}
		
		return "This element has been repeted the most "+output+
				" with the following number of occurances "+max_occurance;
	}

}
