package automobile;

/***
 * 1. Arguments list: Arguments list in the overriding method should be the same as the
 * 		parent class overridden method.
 * 2. Access Modifier: Access Modifier of the overriding method cannot be more restrictive
 * 		than the overridden method.
 * 3. Private, static and final methods cannot be overridden as they are local to the class.
 * 
 * @author soren
 *
 */
public class CarsOverridingChildBMW extends CarsOverridingParent{

	public static void main (String[] args){
		CarsOverridingParent c1 = new CarsOverridingChildBMW();
		c1.engineStart(6);
		
	}
	@Override
	public void engineStart(int cyl){
		//super.engineStart(2);
		System.out.println("I am from the child class");
	}
		
		public static void staticExample(){
			System.out.println("I am the static method from the child class");
		}
}
