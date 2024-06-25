package com.temp.practice.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MostRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String txt = sc.nextLine().trim();
		System.out.print(getMostRepeatedChar(txt));
//		System.out.print(getMostRepeatedCharUsingTreeMap(txt));
		sc.close();
	}
	@SuppressWarnings("unlikely-arg-type")
	public static String getMostRepeatedChar(String str) {
		
		HashMap<String,Integer> charsCountMap = new HashMap<>();
		char[] charStrArr = str.toCharArray();
		for(int i=0; i< charStrArr.length; i++) {
			if(charsCountMap.get(String.valueOf(charStrArr[i])) == null){
				charsCountMap.put(String.valueOf(charStrArr[i]), 1);
			} else {
				Integer count = charsCountMap.get(String.valueOf(charStrArr[i]));
				charsCountMap.put(String.valueOf(charStrArr[i]), count+1);
			}
		}
 		
		return getHighestCountFromHashMap(charsCountMap);
	}
	
	public static String getHighestCountFromHashMap(HashMap<String,Integer> map) {
		int maxCount = 0;
		String maxKey = "";
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String strKey = keyIterator.next();
			Integer count = map.get(strKey);
			if(count > maxCount) {
				maxCount = count;
				maxKey = strKey;
			}
		}
		//printing the entire hash map 
		Iterator<Entry<String, Integer>> a = map.entrySet().iterator();
		while(a.hasNext()) {
			Entry<String, Integer> ent = a.next();
			System.out.format("Key is : %s and value is : %s \n", ent.getKey(),ent.getValue());
		}
		
		return "Most repeated char is: "+maxKey+" and it is repeated :"+maxCount+" times";
	}
	
	public static String getMostRepeatedCharUsingTreeMap(String str){
		
		TreeMap<String, Integer> tmChar = new TreeMap<String, Integer>();
		char[] charStrArr = str.toCharArray();
		for(int i=0; i< charStrArr.length; i++) {
			if(tmChar.get(String.valueOf(charStrArr[i])) == null) {
				tmChar.put(String.valueOf(charStrArr[i]), 1);
			} else {
				Integer count = tmChar.get(String.valueOf(charStrArr[i]));
				tmChar.put(String.valueOf(charStrArr[i]), count+1);
			}
		}
		
		getTreeMapValues(tmChar);
		return tmChar.firstEntry().getKey() +" "+ tmChar.firstEntry().getValue();
	}
	
	private static void getTreeMapValues(TreeMap<String, Integer> tm) {
		
//		using for loop
		Set<String> set = tm.keySet();
		for(String  entry : set){
			System.out.println(entry +" value " +tm.get(entry));
		}
		
//		using iterator
		Iterator<Entry<String, Integer>> setIt = tm.entrySet().iterator();
		while(setIt.hasNext()) {
			Entry<String, Integer> ent = setIt.next();
			System.out.format("Key is : %s and value is : %s \n", ent.getKey(),ent.getValue());
			
		}
	}
	 

}
