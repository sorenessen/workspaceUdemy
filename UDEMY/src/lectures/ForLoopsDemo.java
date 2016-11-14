package lectures;

public class ForLoopsDemo {

	public static void main(String[] args) {
		//for (initialization; boolean_condition; update){ } above is overall
		//structure for using for. examples below
		
		for (int i = 0; i < 10; i++) {
			System.out.println("The value of i is: " + i);
		}// above code returns "The value of i is: 0" and it continues through 9
		System.out.println("****************************");

		for (int i = 0; i <= 10; i++) {
			System.out.println("The value of i is: " + i);
		}// above code returns "" and continues through 10
		System.out.println("****************************");

		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("The value of index " + i + " is " + numbers[i]);
		}// above code is an example of using array with for loop
		System.out.println("****************************");
		
		int[] numbers2 = { 5, 10, 15, 20 };
		for (int number : numbers2) {
			System.out.println("The value is: " + number);
		}// above code is an alternative way to write the previous code, called a 'for each' loop
		System.out.println("****************************");

		String[] cars = { "BMW", "Mercedes", "Speedy Taco Truck" };
		for (String car : cars) {
			System.out.println(car);
		}//above code is an example with a string array, 'for each' loop
		System.out.println("************END*************");
	}
}
