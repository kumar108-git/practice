package com.temp.practice.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		getDivisors(num);
		sc.close();
	}
	public static void getDivisors(int num) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		if(num > 0 ) {
			for(int i=1; i <= num; i++) {
				if(num % i == 0) {
					int divisor = num/i;
					al.add(0,divisor);
				}
				
				
			}
			for(Integer d: al) {
				System.out.format("%s,", d);
			}
		}
	}
}
