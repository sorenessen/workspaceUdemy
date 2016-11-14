package automobile;

/*different number of parameters in argument list
 * 
 */

public class CarsOverloading1 {
	//the arguments must be different. There are 3 ways to do this...
	//1. Number of Parameters could be different
	//2. Data type of Parameters could be different
	//3. Sequence of data type could be different

	public static void main(String[] args) {
		increaseSeatHeight(2);
		increaseSeatHeight(9, true);
		
	
	}
	public static void increaseSeatHeight(int heightToIncrease){
		System.out.println("Increased seat height by " + heightToIncrease + " inches");
	}
	
	
	public static void increaseSeatHeight(int heightToIncrease, boolean rememberHeight){
		System.out.println("Increased seat height by " + heightToIncrease + " inches");
		if(rememberHeight){
			System.out.println("seat height is saved");
		}else{
			System.out.println("seat height is not saved");
		}
	}

}
