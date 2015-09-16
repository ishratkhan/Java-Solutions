package com.hackarrank.ds;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BigDecimalJava {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		ArrayList<BigDecimal> bList = new ArrayList<BigDecimal>();
		Scanner in = new Scanner(System.in);
		int length=in.nextInt();
		int temp=length;
		while (temp>0) {
			bList.add(in.nextBigDecimal());
			temp--;
		}
		Collections.sort(bList);
				
		for(int i=length-1;i>=0;i--){
			BigDecimal big=bList.get(i);
			if(big.toPlainString().startsWith("0."))
				System.out.println(big.toPlainString().replace("0.","."));
			else
				System.out.println(bList.get(i));
		}
	}
}
