package automobile;

public class Cars {
	//No Modifier - accessible in the same package
	int speed;
	int speedLimit = 100;
	private int privateSpeed; //this private is only available within class
	public int publicSpeed; //can be used in any class within Java world using import
	protected int protectedSpeed; //can be used within the package and even SUBCLASSES outside the package
	
	public Cars(){
		this(0);
	}
	
	public void setPrivateSpeed(int pSpeed){
		privateSpeed = pSpeed;
	}
	
	public Cars(int startSpeed){
		speed = startSpeed;
	}
	
	public void increaseSpeed(){
		if (speed < 100){
			speed++;
		}
	System.out.println("Increasing Speed of Cars");
	}
	protected void decreaseSpeed(){
		speed--;
		System.out.println("Decreasing Speed of Cars");
	}


}
