package automobile;

public class InterfaceDemo1 {

	public static void main(String[] args) {
		CarsInterface myInterface = new InterfaceDemo();
		myInterface.engineStart("6 Cyl", true);
		
		BMWCarsInterface myBMWInterface = new InterfaceDemo();
		myBMWInterface.headsUpNavigation();
		
	}
	

}
