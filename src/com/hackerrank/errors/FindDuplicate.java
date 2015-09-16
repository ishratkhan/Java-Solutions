package com.hackerrank.errors;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {

	public static void main(String a[]) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <30; i++) {
			numbers.add(i);
		}
		// add duplicate number into the list
		numbers.add(12);

		FindDuplicate dn = new FindDuplicate();
		System.out.println("Duplicate Number: " + dn.findDuplicate(numbers));
	}

	public int findDuplicate(List<Integer> numbers) {
		//total -  (high * (high+1)/2)
		int high =  numbers.size()-1;
		int total =  getSum(numbers);
		
		return (total - (high * (high +1)/2));
	}
	
	public int getSum( List<Integer> sfre){
		int sum=0;
		for(Integer intd : sfre){
			sum +=intd;
		}
		return sum;
	}	
}
