package com.temp.practice.numbers;

import java.util.ArrayList;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> pnList = new ArrayList<>();
		for(int i=2;i<= 1000; i++)
			if(getPerfectNumber(i)) {
				pnList.add(Integer.valueOf(i));
			}
		
		pnList.forEach((n) -> System.out.format("%s \n", n));
				
	}
	
	public static boolean getPerfectNumber(int num) {
		
		int numSum = 1;
		for(int i=2; i < num; i++) {
			if(num%i == 0) {
				numSum += i;
			}
		}
		
		if(numSum == num) {
			
			return true;
		} else {
			return false;
		}
		
	}

}
