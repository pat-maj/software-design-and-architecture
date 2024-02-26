package simpleCookingFactory;

public class AppController {
	
	public AppController(DessertFactory df) {
		
		Pie pie = df.createPie();
		Cake cake = df.createCake();
		Pastry pastry = df.createPastry();
		
		pie.displayMessage();
		cake.displayMessage();
		pastry.displayMessage();
	}

	public static void main(String[] args) {
		
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		System.out.print("Create Pie\nEnter fruit (Apple, Banana, Cherry): ");
		String fruit = keyboard.next();
		
		AppController ac;
		
		switch(fruit) {
			case "Apple":
				ac = new AppController(new AppleFactory());
				break;
			case "Banana":
				ac = new AppController(new BananaFactory());
				break;
			case "Cherry":
				ac = new AppController(new CherryFactory());
				break;
		}
		
	}
}
