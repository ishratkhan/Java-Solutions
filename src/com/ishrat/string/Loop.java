package com.ishrat.string;

import java.util.Scanner;

public class Loop {
	
	public static void main(String[] argh) {
		Scanner scan = new Scanner(System.in);
		
		int t =Integer.valueOf(scan.nextLine());
		String [] abn = new String[t];
		
		for(int i = 0 ; i<t ; i ++)
			abn[i]=scan.nextLine();
		
		for (String ab : abn){
			String[] numb = ab.split(" ");
			printS(Integer.valueOf(numb[0]), Integer.valueOf(numb[1]), Integer.valueOf(numb[2]));
		}
	}
	
	public static void printS(int a, int b, int n) {

		if( (0<=a && b<=50) && (1<=n && n<=15)){
			int counter = 0;
			int ser[] = new int[n];
			ser[0] = applyFormula(a, b, counter);
			counter++;
			
			int term = 0;
			while (counter != n) {
				/*for (int w : ser) {
					term = term+w + applyFormula(ser[counter], b, counter);
					//System.out.println(term);
				}*/
				ser[counter] = applyFormula(ser[counter-1], b, counter);
				counter++;
			}
			
			for(int s : ser)
				System.out.print(s+" ");
			System.out.println("");
		}
		
	}
	
	public static int applyFormula(int a,int b,int counter){
		return (int) (a+Math.pow(Double.valueOf(2),Double.valueOf(counter))*b);
	}
}
