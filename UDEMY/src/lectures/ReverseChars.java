package lectures;

import java.util.Scanner;

public class ReverseChars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner is used to prompt the
												// user
		System.out.println("Please enter a string: "); // to input some
														// information in the
														// console.
		String original = scan.nextLine(); // <--Captures whatever the user
											// inputs

		while (original.isEmpty() || original == null) { // if user fails to
															// enter a value,
															// then...
			System.out.println("Please enter a valid string! Empty or null string is not accepted!");
			original = scan.nextLine(); // prompts user to enter a valid string
										// again until they do
		}
		scan.close(); // ends the scanner
		
		ReverseChars output = new ReverseChars();
		String reverseCharacters = output.reverseCharacters(original);
		System.out.println(reverseCharacters);
	}
	private String reverseCharacters(String newOriginalString){
		String reverse = "";
		for (int i = newOriginalString.length() - 1; i >= 0; i--){
			reverse = reverse + newOriginalString.charAt(i);
		}
		
		return reverse;
		}
}
