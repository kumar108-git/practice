package com.temp.practice.numbers;

import java.util.ArrayList;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> pf = getPrimeFactors(72);
		pf.forEach((val) -> System.out.format("%s,",val));
//		printPrimeFactors(72);
	}
	public static ArrayList<Integer> getPrimeFactors(int num) {
		
		ArrayList<Integer> pn = new ArrayList<>();
		double d=Math.sqrt(num);		
		int limit = (int)Math.sqrt(num);
		for(int i=2; i < limit; i++ ) {
			while(num % i == 0) {
				pn.add(i);
				num = num/i;
			}
			
		}
		if(num > 2) {
			pn.add(num);
		}
		return pn;
	}
	
	private static void printPrimeFactors(int num){
		int limit = (int) Math.sqrt(num);
		
		for(int i=2;i<=limit;i++){
			while(num % i == 0){
				System.out.print(i+", ");
				num = num/i;
			}
		}
		if(num > 2)
			System.out.print(num);
	}
}
