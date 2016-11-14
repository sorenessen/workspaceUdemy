package lectures;
//the access modifier is public class, it means the class can be accessed by anybody outside 
//of the class, also the name of the file will match the class name
public class ClassDemo {

		static String str2 = "Hello there!";
	
	public static void main(String[] args) {
		
		String str1 = "Hello Java"; //example of a variable declared inside the method
		System.out.println(str1);
		//System.out.println(str2);
		
		for (int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}	
			System.out.println("**********************************************************");
			
		CarClass c1 = new CarClass();
		CarClass c2 = new CarClass();
		
		c1.model = "bmw";
		c1.year = 2015;
		c2.model = "fiat";
		c2.year = 2005;
		
		System.out.println(c1.year);
		System.out.println(c1.getYear());
		System.out.println(c2.year);
		System.out.println(c2.getYear());
		
	}
}
class CarClass {
	  int year = 2000;
	  String model;
	  
	  public int getYear(){
	  	return this.year;
	  }
}