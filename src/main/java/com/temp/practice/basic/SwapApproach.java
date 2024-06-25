package com.temp.practice.basic;

public class SwapApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSwapApproach1(15,20);
	}
	public static void getSwapApproach1(int a,int b) {
		a = a+b;
		b = a - b;
		a = a - b;
		System.out.format("Value of a is: %s and Value of b is: %s",a,b);
		
	}
}
