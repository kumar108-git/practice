package com.temp.practice.strings;

import java.util.Scanner;

public class AllSubsetsUsingRecursion {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = scanner.nextLine().trim();
		printAllSubsets(str);
		scanner.close();
	}
	//using recursion approach
	public static void printAllSubsets(String str) {
		char array[] =str.toCharArray();
		int visited[] = new int[array.length];
		traverse(array, visited,0);
	}
	public static void traverse(char array[],int visited[],int curIndex){
		System.out.print("\n{ ");
		for(int i=0;i<visited.length;i++)
			if(visited[i] == 1)
				System.out.print(array[i]+" ");
		System.out.print("}");
		
		for(int j=curIndex;j<array.length;j++){
			visited[j] = 1;
			traverse(array, visited,j+1);
			visited[j] = 0;
		}
	}	
}