package automobile;

/***
 * Difference in data type of arguments
 * @author soren
 *
 */


public class CarsOverloading2 {

	public static void main(String[] args) {
		increaseSeatHeight(8);
		increaseSeatHeight("7");
		

	}
	public static void increaseSeatHeight(int heightToIncrease){
		System.out.println("Increased seat height by " + heightToIncrease + " inches. I am the integer version");

}
	public static void increaseSeatHeight(String heightToIncrease){
		System.out.println("Increased seat height by " + heightToIncrease + " inches. I am the string version");
	}
}
