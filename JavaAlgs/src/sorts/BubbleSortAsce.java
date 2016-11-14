package sorts;

import java.util.Arrays;

public class BubbleSortAsce {
	
	public static void main(String[] args) {
		int arrayList[] = {8,5,7,4,6,3,5,2,1};
		System.out.println("\nFinal result:"+Arrays.toString(BubbleSortAsceMethod(arrayList)));
		//System.out.println("\nFinal result:"+Arrays.toString(BubbleSortDescMethod(arrayList)));	
	}
	
	public static int[] BubbleSortAsceMethod(int[] arr){
		int temp;
		for(int i=0; i < arr.length-1; i++){
			
			for(int j = 1; j < arr.length-i; j++){
				if(arr[j-1] > arr[j]){
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j] = temp;
				}
			}
			System.out.println((i+1)+"th iteration result: "+Arrays.toString(arr));
		}
		return arr;
		
		
	}

}
