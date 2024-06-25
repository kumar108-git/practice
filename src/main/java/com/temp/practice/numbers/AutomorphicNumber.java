package com.temp.practice.numbers;
import java.util.ArrayList;
public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		Integer num = Integer.valueOf(sc.nextLine().trim());
		ArrayList<Integer> arL = new ArrayList<Integer>();
		for(int i=0; i < 1000; i++) {
			if(isAutomorphicNumber(i)) {
				arL.add(i);
			}
		}
		arL.forEach(value -> System.out.println(value));
		isAutomorphicNumber(376);
	}
	
	public static boolean isAutomorphicNumber(Integer num) {
		
		int numberOfNumDigits = String.valueOf(num).length();
		Integer sqRoot = num*num;
		String a = String.valueOf(sqRoot);
		int l = String.valueOf(sqRoot).length();
		int s = l - numberOfNumDigits;
		a.substring(s);
		int lastDigit = sqRoot % 10;
		if(lastDigit == num) {
			return true;
		} else {
			return false;
		}	
	}
	
	private static boolean isAutomorphicNumber(int n){
		
		int numberOfNumDigits = String.valueOf(n).length();
		Integer sqRoot = n*n;
		String a = String.valueOf(sqRoot);
		int l = String.valueOf(sqRoot).length();
		int s = l - numberOfNumDigits;
		String b = a.substring(s);	
		if(n == Integer.valueOf(b)) {
			return true;
		} else {
			return false;
		}
			
	}

}
