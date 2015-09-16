package com.hackerrank;

import java.util.Scanner;

public class StarPrint {

	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int N = in.nextInt();
		int hashCount = 0;
		int spaceCount = N-1;
		
		for(int i=0 ; i<N ; i++){
				 for(int j=0;j<spaceCount;j++)
					 System.out.print(" ");
				 for(int k=0;k<=hashCount;k++)
					 System.out.print("#");
				 
				 hashCount++;
				 spaceCount--; 
				 System.out.println();
		}
	}
}
