package Algorithms;

import java.util.Arrays;

public class MissingNumberDemo {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,10};
		int missingNumber = getMissingNumber(array,10);
		System.out.printf("Missing number in array %s is %d %n",Arrays.toString(array),missingNumber);

	}
	
	private static int getMissingNumber(int[] array, int n){
		int actualSum=0;
		int expectedSum= (n*(n+1)/2);
		for(int i : array){
			actualSum = actualSum+i;	
		}
		return expectedSum-actualSum;
	}

}
