package com.hackarrank.algo;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String S = in.next();
		int K = in.nextInt();
		char c[] = S.toCharArray();
		for (char cha : c) {
			int ascii = ((int) (cha));
			
			while (K > 26) {
				K = K-26;
			}
			
			int sumOf = (ascii + K);
			if ((ascii >= 65 && ascii <= 90)) { // A-Z
								
				ascii = sumOf;

				if (sumOf > 90)
					ascii = 64 + (sumOf - 90);				

			}else if (ascii >= 97 && ascii <= 122){ // a-z
				ascii = sumOf;
				 if (sumOf > 122)
					  ascii = 96 + (sumOf - 122);
			}

			System.out.print((char) (ascii));
		}

	}
}
