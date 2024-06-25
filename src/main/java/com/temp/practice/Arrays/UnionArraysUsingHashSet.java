package com.temp.practice.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class UnionArraysUsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ar_1 = {17, 23, 31, 14, 25, 26};
		Integer[] ar_2 = {23, 44, 14, 8, 17};
		HashSet<Integer> set = new HashSet<Integer>();
		set = getUnionArray(ar_1, ar_2);		
		set.forEach(value -> System.out.print(value+" "));

	}
	
	public static HashSet<Integer> getUnionArray(Integer[] arr_1,Integer[] arr_2) {
		
		
		HashSet<Integer> hSet = new HashSet<>();
		
		hSet.addAll(Arrays.asList(arr_1));
		hSet.addAll(Arrays.asList(arr_2));
		
		hSet.toArray(new Integer[hSet.size()]);
		
		return hSet;
		
	}

}
