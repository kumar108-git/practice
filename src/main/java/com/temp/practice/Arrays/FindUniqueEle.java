package com.temp.practice.Arrays;

import java.util.ArrayList;

public class FindUniqueEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {5, 10, 33, 42, 5, 42, 10,6};;
		ArrayList<Integer> arList = new ArrayList<>();
		arList = getUniqueElementArray(ar);
		for(Integer a : arList) {
			System.out.println("Unique element is : "+a);
		}
	}
	
	public static ArrayList<Integer> getUniqueElementArray(int[] arr) {
		ArrayList<Integer>  ArrList = new ArrayList<>();
		Integer uniqueEl;
		for(int i=0; i < arr.length; i++) {
			int j=0;
			while(j < arr.length) {
				if((arr[i] == arr[j]) && (i != j) ){					
					break;
				} else if(j == arr.length -1) {
					uniqueEl = Integer.valueOf(arr[i]);
					ArrList.add(uniqueEl);
					break;
				} else {
					j++;
				}
			}
			
		}
		return ArrList;
	}

}
