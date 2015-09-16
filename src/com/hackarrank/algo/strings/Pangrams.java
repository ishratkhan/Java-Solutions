package com.hackarrank.algo.strings;

import java.util.Scanner;

public class Pangrams {

	public static void main(String[] argh) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();
		int length =str.length();
		
		if(1<=length && length<=1000){
			char[] atoz =  "abcdefghijklmnopqrstuvwxyz".toCharArray();
			int counter = 0;
			for(char c : atoz){
				if(str.contains(String.valueOf(c))){
					counter++;					
				}
			}
			
			if(counter<26)
				System.out.println("not pangram");
			else 
				System.out.println("pangram");
		}
		
	}
	
	
}
