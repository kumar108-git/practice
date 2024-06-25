package com.temp.practice.numbers;

import java.util.ArrayList;

public class KaprekarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> knList = new ArrayList<Integer>();
		for(int i=0; i < 1000; i++) {
			knList.addAll(getKaprekarNumber(i));
		}
		
		knList.forEach(value -> System.out.println(value));
		
	}
	
	public static ArrayList<Integer> getKaprekarNumber(int num){
		
		ArrayList<Integer> kn = new ArrayList<Integer>();
		int sqrt = num*num;
		
		int digits = String.valueOf(sqrt).length();
		String sq = String.valueOf(sqrt);
		
		if(digits%2 == 0){
			int mid = digits/2;
			String sqFirst = sq.substring(0, mid);
			String sqSecond = sq.substring(mid);
			Integer sqFst = Integer.valueOf(sqFirst);
			Integer sqScnd = Integer.valueOf(sqSecond);
			if((sqFst >0 && sqScnd > 0) && (sqFst+sqScnd) == num) {
				kn.add(num);
			}
			
		} else if(digits >= 3) {
			String sqFirst = sq.substring(0, 2);
			String sqSecond = sq.substring(2);
			Integer sqFst = Integer.valueOf(sqFirst);
			Integer sqScnd = Integer.valueOf(sqSecond);
			if((sqFst >0 && sqScnd > 0) && (sqFst+sqScnd) == num) {
				kn.add(num);
			}
			
		}
		return kn;
	}
	
	

}
