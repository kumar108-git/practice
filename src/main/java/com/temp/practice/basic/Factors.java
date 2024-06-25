package com.temp.practice.basic;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getFactors(27);
	}
	
	public static void getFactors(int num) {
		
		for(int i=1; i<= num; i++) {
			if(num%i == 0) {
				System.out.format("%s,", i);
			}
		}
		
	}

}
