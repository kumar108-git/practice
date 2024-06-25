package com.temp.practice.numbers;

public class GreatestCommonDiviser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 55;
	
		// for this approach 
		//a should be bigger
		//b should be small
		if(a < b){
			int temp = a;
			a = b;
			b = temp;
		}
		
		while(b > 0){
			int temp = b;
			//as b is small get reminder of a and b
			b = a%b;
			a = temp;
		}
		System.out.println("GCD is 10 & 55 : "+a);
	}

	

}
