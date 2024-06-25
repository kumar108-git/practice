package com.temp.practice.basic;

public class lowestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lowest;
		int	a = 20;
		int b = 30;
		int c= 12;
		if(a/b == 0) {
			lowest = a;
		} else {
			lowest = b;
		}
		if(c/lowest == 0) {
			lowest=c;
		}

		System.out.print("lowest number is: "+lowest);

	}
	
}
