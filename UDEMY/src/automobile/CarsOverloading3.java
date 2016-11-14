package automobile;

/***
 * Differing sequence of data types in arguments
 * 
 * @author soren
 *
 */
public class CarsOverloading3 {

	public static void main(String[] args) {
		increaseSeatHeight("6",9);
		increaseSeatHeight(2,"5");
		
	}

	public static void increaseSeatHeight(String variable1, int variable2) {
		System.out.println("I am the first overload");
	}
	public static void increaseSeatHeight(int variable2, String variable1) {
		System.out.println("I am the second overload");
	}
}