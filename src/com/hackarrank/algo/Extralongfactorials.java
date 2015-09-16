package com.hackarrank.algo;

import java.math.BigInteger;
import java.util.Scanner;

public class Extralongfactorials {

	public static void main(String args[]) {
		BigInteger bin = BigInteger.valueOf(1);
		Scanner in =new Scanner(System.in);
		
		int N= in.nextInt();
		while(N>0){
			bin=bin.multiply(BigInteger.valueOf(N));
			N--;
		}
		System.out.println(bin);
	}
	
}
