package com.hackarrank.algo.strings;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		if (1 <= T && T <= 10) {

			for (int i = 0; i <= T; T++) {
				String str = scan.nextLine();
				int length = str.length();

				if (1 <= length && length <= 100000) {
					char[] cAr = str.toCharArray();
					int deletion = 0;
					char prev = cAr[0];

					for (int j = 1; j < cAr.length; j++) {
						if (prev == cAr[j])
							deletion++;
						prev = cAr[j];
					}
					System.out.println(deletion);
				}
			}
		}
	}
}
