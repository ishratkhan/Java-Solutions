package com.hackarrank.algo.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Gemstones {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		int N = Integer.valueOf(myScan.nextLine());
		if (1 <= N && N <= 100) {
			String[] compo = new String[N];

			for (int i = 0; i < N; i++) {
				String l = myScan.nextLine();

				if (1 <= l.length() && l.length() <= 100) {
					compo[i] = l;
				}
			}

			if (compo.length == N) {

				Map<Character, Integer> map = new HashMap<Character, Integer>();

				char[] chars = compo[0].toCharArray();
				for (char c : chars) {
					map.put(c,0);
					
					for (String line : compo) {
						if (line.contains(String.valueOf(c))) {
							map.put(c, map.get(c) + 1);
						}							
					}
				}

				int counter = 0;
				for (Map.Entry<Character, Integer> entr : map.entrySet()) {
					if (entr.getValue() == N)
						counter++;
				}

				System.out.println(counter);
			}
		}

	}
}
