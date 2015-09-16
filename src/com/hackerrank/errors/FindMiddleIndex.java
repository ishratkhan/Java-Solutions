package com.hackerrank.errors;

public class FindMiddleIndex {

	public static void main(String a[]) {
		int[] num = { 2, 4, 4, 5, 4, 1 };
		try {
			System.out.println("Starting from index 0, adding numbers till index "+ findMiddleIndex(num) + " and");
			System.out.println("adding rest of the numbers can be equal");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public static int findMiddleIndex(int[] array) {

		int leftSum = 0;
		int rightSum = 0;
		int sIndex = 0;
		int eIndex = array.length - 1;

		while (true) {

			if (leftSum > rightSum)
				rightSum += array[eIndex--];
			else {
				leftSum += array[sIndex++];
			}
			
			if(sIndex>eIndex){
				if(rightSum == leftSum)
					return eIndex;
				else {
					return 0;
				}
			}
		}
	}
}
