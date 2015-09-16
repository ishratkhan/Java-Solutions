package com.hackarrank.algo.sorting;

import java.util.Scanner;

public class InsertSort2 {

	public static void insertIntoSorted(int[] A) {
		// Fill up this function
		int n=A.length;
		for( int i = 1 ;i < n ; i++ ) {
			int temp = A[ i ];
			int j = i;
			while (j > 0 && temp < A[j - 1]) {
				// moving the left side element to one position forward .
				A[j] = A[j - 1];
				j = j - 1;
			}
			A[ j ] = temp;
			printArray(A);
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
