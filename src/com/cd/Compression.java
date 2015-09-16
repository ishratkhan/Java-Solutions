package com.cd;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Compression {

	public static void main(String[] args) throws IOException {
		
		System.out.println(compress("aaaaabbcdef"));
		/*Scanner in = new Scanner(System.in);
		final String fileName = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		String res;
		String _str;
		try {
			_str = in.nextLine();
		} catch (Exception e) {
			_str = null;
		}

		res = compress(_str);
		bw.write(res);
		bw.newLine();

		bw.close();*/
	}

	static String compress(String str) {
		SortedMap<Character,Integer> alphaCount= new TreeMap<Character, Integer>();
		
		for(char c : str.toCharArray()){			
			if(alphaCount.containsKey(c))
				alphaCount.put(c, alphaCount.get(c)+1);
				else
					alphaCount.put(c, 1);
		} 
				
		StringBuilder sb = new StringBuilder();
		Set<Entry<Character, Integer>> ste= alphaCount.entrySet();
		
		for(Entry etr : ste){			
			sb.append(etr.getKey());
			int value = (Integer) etr.getValue(); 
			if(value>1)
				sb.append(value);
		}
		return sb.toString();
	}
}
