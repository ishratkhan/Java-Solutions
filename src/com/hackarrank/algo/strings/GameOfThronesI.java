package com.hackarrank.algo.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class GameOfThronesI {

	//http://www.java-fries.com/2015/05/check-if-characters-of-a-given-string-can-be-rearranged-to-form-a-palindrome/
	public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        int length = inputString.length();
        
        String ans = null;
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        
        if (1 <= length && length <= 100000) {
        	 Map<Character,Integer> map= new HashMap<Character, Integer>();
             char[] chars = inputString.toCharArray();
             
             for(char c :  chars){
            	 if(map.containsKey(c))
            		 map.put(c,map.get(c)+1);
            	 else
            		 map.put(c,1);
             }             
             
             int coutner=0;
            for(Map.Entry<Character,Integer> set : map.entrySet()){
            	
            	if(set.getValue()%2 != 0)
            		coutner++;
            }
            
			if (coutner > 1)
				ans = "NO";
			else {
				ans = "YES";
			}
            		 
        }
       
       
        
        System.out.println(ans);
        myScan.close();
    }
	/*
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		String inputString = myScan.nextLine();
		int length = inputString.length();
		
		String ans;
		
		if (1 <= length && length <= 100000) {
			// Assign ans a value of YES or NO, depending on whether or not
			// inputString satisfies the required condition
			
			permutation(inputString);
			boolean isP = false;
			
			for(String sg : set){
				isP=isPalindrom(sg);				
				if(isP)
					break;
			}
			
			System.out.println(isP?"YES":"NO");
						
			myScan.close();
		}
		
		
	}*/
/*
	public static void permutation(String str) { 
	    permutation("", str); 
	}
	
	static Set<String> set= new HashSet<String>();
	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) {	    	
	    	System.out.println(prefix);	
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
	public static boolean isPalindrom(String str) {
		boolean ret = true;
		int len = str.length() - 1;
		for (int i = 0; i <= len; i++) {
			if (i < len) {
				if (str.charAt(i) != str.charAt(len - i)) {
					ret = false;
				}
			}
		}
		return ret;
	}*/
}
