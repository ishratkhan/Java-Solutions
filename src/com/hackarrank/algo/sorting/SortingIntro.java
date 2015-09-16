package com.hackarrank.algo.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class SortingIntro {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int toFind = in.nextInt();
		int arSize = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (arSize>0) {
			list.add(in.nextInt());
			arSize--;
		}
		
		System.out.println(list.indexOf(toFind));
	}
}
