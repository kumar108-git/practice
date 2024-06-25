package com.temp.practice.basic;

public class PrintNWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPrintNWithoutLoop(1);
	}
	public static void getPrintNWithoutLoop(int n) {
		System.out.println(n);
		if(n < 10)
			getPrintNWithoutLoop(n+1);
	}
}
