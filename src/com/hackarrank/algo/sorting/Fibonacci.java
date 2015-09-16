package com.hackarrank.algo.sorting;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {

	public static void getValue(BigInteger T0,BigInteger T1, int count) {
		
		if(count == 0){		
			System.out.println(T1);
			
		} else {
			
			getValue(T1, (T1.multiply(T1).add(T0)), --count);
		}
		 
	   }

	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int N = in.nextInt();
		getValue(BigInteger.valueOf(A),BigInteger.valueOf(B), N-2);	

	}
}
