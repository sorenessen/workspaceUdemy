package lectures;

public class Car{
	private String make;
	int speed;
	int gear;
	
	public Car(){
//		this(10,2); //this will call below constructor
//		this.speed = 0; //these two lines will override the above line
//		this.gear = 0;
		System.out.println("Executing constructor without any arguments.");
		//as soon as the object is created, everything in the structure is triggered, so this
		//message prints out first. Think of it as a bootup message, it's printed right away.
	}
	public Car(int speed, int gear){
		this.speed = speed;
		this.gear = gear;
		System.out.println("Executing constructor WITH arguments");
	}
	
	//"this" refers to the instance of the class (object)
	public void setMake(String make){
		this.make = make;
	}
	public String getMake(){
		return make;
	}

}
