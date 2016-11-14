package Algorithms;

public class EvenOddNumbers {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 4, 8, 7, 3, 9, 5, 6, 2 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) 
				System.out.println(numbers[i] + " is even number.");

			else 
				System.out.println(numbers[i] + " is odd number.");
			}

		}

	}

