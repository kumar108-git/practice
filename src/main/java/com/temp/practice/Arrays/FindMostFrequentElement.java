package com.temp.practice.Arrays;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;



public class FindMostFrequentElement {

	public static void main(String[] args) {
		int[] ar = {8, 9, 3, 3, 6, 3, 8, 1, 6};;
		
		HashMap<Integer,Integer> freMap = getMostFrequentedElement(ar);
		for(Map.Entry<Integer, Integer> nKey : freMap.entrySet()) {
			System.out.println("The element "+nKey.getKey()+" has been repeted "+nKey.getValue()+" times");
		}
		
	}
	
	public static HashMap<Integer,Integer> getMostFrequentedElement(int[] arr) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int el: arr) {
			map.put(el, null);			
		}
		
		for(Map.Entry<Integer,Integer> k : map.entrySet()) {
			int count=0;
			for(int i=0; i < arr.length;i++) {
				if(k.getKey() == arr[i]) {
					count = count +1;
				}
				if(count >= 2) {
					map.put(k.getKey(), count);
				}
			}
		}
		
		
		
		return map;
	}

}
