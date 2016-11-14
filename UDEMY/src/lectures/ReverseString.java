package lectures;

public class ReverseString {

	public static void main(String[] args) {
		String input = ""; //"This is a string";
		String output = reverse(input);
		System.out.println(output);
	}
	private static String reverse(String input){
		String reverse = "";
		if (input.isEmpty() || input == null){
			System.out.println("Empty and null strings are not accepted!!!");
		}
		
		if (input.length()<=1){
			reverse = input;
		}else{
			String[] originalArray = input.split("\\s+");
			
			for (String item: originalArray){ //<---This is a string
				reverse = item + " " + reverse;//<--This + "", is + This, a + is This, string + a is This
			}
		}
		
		return reverse.trim();
	}
}
