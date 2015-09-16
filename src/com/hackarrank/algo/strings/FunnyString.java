package com.hackarrank.algo.strings;

import java.util.Scanner;

public class FunnyString {


	public static void main(String[] argh) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		if(1<=T && T<=10){
			for(int i = 0 ; i<=T ; i ++ ){
				String S=scan.nextLine();
				scanFunnuy(S);
				
			}
		}
		
	}
	
	public static void scanFunnuy(String S) {
		int length = S.length();
		boolean isFunny=true;
		
		if (2 <= length && length <= 10000) {
			char[] oStr= S.toCharArray();
			char[] rStr = new StringBuilder(S).reverse().toString().toCharArray();
			
			
			for (int i = 1; i < length; i++) {
				int oM = Math.abs(Integer.valueOf(oStr[i]) - Integer.valueOf(oStr[i - 1]));
				int rM = Math.abs(Integer.valueOf(rStr[i]) - Integer.valueOf(rStr[i - 1]));

				if (oM != rM)
					isFunny = false;

			}
			
			System.out.println(isFunny?"Funny":"Not Funny");
		}
		
		
	}
}
