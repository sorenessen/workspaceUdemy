package lectures;

import java.util.*;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
//		int[] myIntArray1; //defining the array reference
//		myIntArray1 = new int[10]; //this will reserve space in heap to hold 10 integer values
//		
//		myIntArray1[0] = 100;
//		myIntArray1[1] = 90;
		
//		System.out.println("Index 0: " + myIntArray1[0]);
//		System.out.println("Index 1: " + myIntArray1[1]);
//		System.out.println("Index 2: " + myIntArray1[2]); /*note: default value of an undefined element
//	                                                        inside of an array is 0.*/
		
		String[] myStringArray1 = {"bmw","audi","toyota"};    //note: you can define your reference,array size
		int[] myIntArray1 = {100,90};                        //and its values on one line such as this
		System.out.println("Index 0: " + myStringArray1[0]);
		System.out.println("Index 1: " + myStringArray1[1]);
		System.out.println("Index 2: " + myStringArray1[2]);
		System.out.println("Index 0: " + myIntArray1[0]);
		System.out.println("Index 1: " + myIntArray1[1]);
		
		//you can return the lengths of the arrays based on their elements, so 
		//myStringArray1 will return 3 because there are 3 defined elements and myIntArray1 will return 2.
		//These are very useful when using loops:
		int len1 = myStringArray1.length;
		int len2 = myIntArray1.length;
		
		System.out.println("String array length: " +len1);
		System.out.println("Int array length: " +len2);
		
		//if you just use a regular for loop for these arrays, the values will return in the order they were
		//defined
		for (int i = 0; i < len1; i++){
			System.out.println(myStringArray1[i]);
		}
		for (int i = 0; i < len2; i++){
			System.out.println(myIntArray1[i]);
		}
		//if you use Arrays.sort() it will return values in alphabetical or ascending orders
		Arrays.sort(myStringArray1);
		Arrays.sort(myIntArray1);
		
		for (int i = 0; i < len1; i++){
			System.out.println(myStringArray1[i]);
		}
		for (int i = 0; i < len2; i++){
			System.out.println(myIntArray1[i]);
		}
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		int arr1[] = {4, 5, 3, 6, 2, 7, 1, 8};
		int arr2[] = {44, 55, 33, 66, 22, 77, 11, 88};
		
		 System.arraycopy(arr1, 0, arr2, 0, 1);
		   System.out.print("array2 = ");
		   System.out.print(arr2[0] + " ");
		   System.out.print(arr2[2] + " ");
		   System.out.print(arr1[5] + " ");
		   System.out.print(arr2[6] + " ");
		   System.out.print(arr1[7] + " ");
		   
	}
}
