package com.temp.practice.Arrays;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ar = {'a','b','c','d'};
		System.out.println(getSubsets(ar));
	}
	
	public static StringBuffer getSubsets(char[] arr) {
		
		int n = arr.length;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<n;i++) {
			int j=0;
			while((j < n)) {
				if( i != j) {
					sb.append("{"+arr[i]+","+arr[j]+"} \n");
				}				
				if(i == j) {
					sb.append("{"+arr[i]+"} \n");
				}
				if((n-i >= 1) && (i!=j) && (j != (n-1))) {
					sb.append("{"+arr[i]+","+arr[j]+","+arr[n-1]+"} \n");
				}
				j++;
			}
		}
		
		return sb;
	}
	

}
