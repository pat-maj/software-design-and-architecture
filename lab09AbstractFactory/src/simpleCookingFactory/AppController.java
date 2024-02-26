package simpleCookingFactory;

public class AppController {
	
	public AppController(DessertFactory df, String product) {
		
		switch(product) {
			case "Pie":
				df.createPie();
				break;
			case "Cake":
				df.createCake();
				break;
			case "Pastry":
				df.createPastry();
				break;
		}
	}

	public static void main(String[] args) {
		
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		System.out.print("Create Pie\nEnter fruit (Apple, Banana, Cherry): ");
		String fruit = keyboard.next();
		AppController ac = new AppController(new AppleFactory(), "Pie");
		
		switch(fruit) {
			case "Apple":
				
				break;
			case "Cherry":
		}
	}
// HOW DO I SELECT DIFFERENT PRODUCT? OR Do I need to call Pie p = df.createPie(); p.message.....
}
