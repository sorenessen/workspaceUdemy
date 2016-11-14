package automobile;

public class BMW extends Cars{
	public BMW(int startSpeed){
		super(startSpeed);
	}
	//in overriding, i can pull methods from my parent class (Cars) and use them here and 
	//change their functionality.

	@Override									//right click whitespace, click 'source', click override//
	public void increaseSpeed() {
		protectedSpeed++;
		Cars c1 = new Cars();
		c1.decreaseSpeed();
		System.out.println("Increase Speed of BMW!");

	}
	public void headsUpDisplayNavigation(){
		System.out.println("Specific functionality to BMW");
	}
}
