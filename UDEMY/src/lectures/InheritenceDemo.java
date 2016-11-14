package lectures;

import automobile.BMW;
import automobile.Cars;

public class InheritenceDemo {

	public static void main(String[] args) {
		int speed = 0;
		
		Cars c1 = new Cars(speed);
		c1.increaseSpeed();
		c1.publicSpeed = 100;
		
		
		BMW bmw1 = new BMW(speed);
		bmw1.increaseSpeed();
		bmw1.headsUpDisplayNavigation();
		
	}

}
