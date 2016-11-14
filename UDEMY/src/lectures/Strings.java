package lectures;

public class Strings {

	public static void main(String[] args) {
		String str = "This is a string test haha";
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "goodbye";
		String str4 = "";
		String str5 = "    lots of spaces??   ";
		String str6 = "What latter letter can replace an earlier character?";
		
		System.out.println(str.length()); //returns length of string
		System.out.println(str.charAt(8)); //returns char at location of index
		System.out.println(str.concat(" This is an appendage")); //appends string
		System.out.println(str.contains("string")); //check if string contains this
		System.out.println(str.contains("testify")); //check if string contains this
		System.out.println(str.startsWith("This")); //check if starts with prefix
		System.out.println(str.startsWith("a")); //check if starts with prefix
		System.out.println(str.endsWith("haha")); //check if ends with suffix
		System.out.println(str.endsWith("test")); //check if ends with suffix 
		System.out.println(str1.equals(str2)); //check if strings are the same
		System.out.println(str1.equals(str3)); //check if strings are the same
		
		System.out.println(str.indexOf('z')); //check index of character,if not in the string, returns '-1'
		System.out.println(str.indexOf('r')); //check index of character
		System.out.println(str.isEmpty()); //check to see if string is empty
		System.out.println(str4.isEmpty()); //check to see if string is empty
		System.out.println(str5.trim()); //omits of leading and tailing white space
		System.out.println(str6.replace('a', 'x')); //replaces first char with second char
		
		System.out.println(str6.substring(6)); //prints from spec'd index to end of string
		System.out.println(str6.substring(6, 26)); //from spec'd index-last spec'd index(won't print 2nd index)
		
		char[] charArray=str.toCharArray();
		for (int i=0; i<charArray.length; i++){
			System.out.println("index " + i + " is: " + charArray[i]); //prints the charArray line by line
		}
		System.out.println("This is LowerCase: "+ str.toLowerCase());
		System.out.println("This is UpperCase: "+ str.toUpperCase());
		}
		
	}


