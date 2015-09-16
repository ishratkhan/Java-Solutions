package com.hackarrank.algo.sorting;

import java.util.Scanner;

public class InsertSort1 {

	public static void insertIntoSorted(int[] ar) {
		// Fill up this function
		int len = ar.length;
		int rightMost = ar[len - 1];
		boolean rightMostPlaecd=false;
		for (int i = len-2; i >= 0; i--) {
			 
			if (ar[i] > rightMost) {
				ar[i + 1] = ar[i];
			} else if (ar[i] < rightMost && !rightMostPlaecd) {
				ar[i + 1] = rightMost;
				rightMostPlaecd=true;
			}/*else{
				ar[i]=rightMost;
			}*/

			
			printArray(ar);
			
			if (i == 0 && rightMost < ar[0]) {
				ar[i] = rightMost;
				rightMostPlaecd = true;
				printArray(ar);
			}
			
			if(rightMostPlaecd)
				break;
		}
	}
    
    
	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
    
}
