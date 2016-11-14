package Algorithms;

	
	public class FindLargestSmallestNumber {
		 

		public static void main (String[] args) {

			int[] numbers = new int[] {32,65,34,78,34,87,90,120,62,2};

			int smallest = numbers[0];
			int largest = numbers[0];

			for(int i = 1; i < numbers.length; i++){
				if(numbers[i] > largest)
					largest = numbers[i];
				else if (numbers[i] < smallest)
					smallest = numbers[i];
			}
			System.out.println("largest number is "+largest);
			System.out.println("smallest number is "+smallest);
			
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
//		Half Pyramid:


			for(int a = 5; a > 0; a--){
				for(int j = 1; j <= a; j++){
				System.out.print(j);
				}
				System.out.println("");
			}

		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//			Factors:


			for(int b=1; b <= 100; b++){
				System.out.println("The factors of number "+b+ " are:");
				for (int k=1; k<=b;k++){
				if(b%k==0){
				System.out.println(""+k);
				}
			}
		}

		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//			Even/Odd Numbers:

//			public static void main(String[] args) {

				int[] numbers1 = new int[] {1,4,8,7,3,9,5,6,2};
			
				for(int c=0; c < numbers1.length; c++){
					if(numbers1[c]%2==0)
						System.out.println(numbers1[c] + " is even number");
					
					else
						System.out.println(numbers1[c] + " is odd number");
					}
				}
	}


