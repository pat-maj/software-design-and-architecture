/*
 * AppController: 
 * Welcome to the Bakery!
 */
package advancedcooking;


public class AdvancedAppController {
	public static void main(String args[]) {
		System.out.println("Booting AppController...");

		// fruity familes are (Apple, Banana, Cherry)
		// products per family are Pie, Cake, Pastry

		// let's make some random selections
		Pie pie1 = new ApplePie();
		pie1.printCreated();
		Pie pie2 = new BananaPie();
		pie2.printCreated();
		Cake cake = new AppleCake();
		cake.printCreated();
		cake.printCreated();
		Pastry pastry = new BananaPastry();
		pastry.printCreated();

		/*
		 * we also want to bake-on-demand i.e. determine Fruit at run time and then bake
		 * the relevant Pie the below (and the given Pie constructors & inheritence) is
		 * a really ugly solution How would you improve this?
		 */
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		System.out.print("Enter fruit (Apple, Banana, Cherry, ...): ");
		String fruit = keyboard.next();

		switch(fruit) {
			case "Apple":
				// Pie pie3 = ...
		}
		
	}
}
