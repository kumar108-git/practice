package com.temp.practice.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPairsforZInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1, 4, 45, 6, 10, 8};
		int z = 16;
		HashMap<Integer, String> hm = getPairsForZInArray(ar,z);
		hm.forEach((key, value) -> System.out.println(key + " "+ value ));
	}
	
	public static HashMap<Integer,String> getPairsForZInArray(int[] arr, int z) {
		
		Arrays.sort(arr);
		HashMap<Integer,String> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {			
			for(int j=1+i; j < arr.length -1; j++) {
				if((arr[i]+arr[j]) == z) {
					String xPair = String.valueOf(arr[i]);
					String yPair = String.valueOf(arr[j]);
					map.put(j, "Pair "+"X value is: "+xPair+" Y value is :"+yPair);
				}
			}
		}
		
		return map;
	}

}
