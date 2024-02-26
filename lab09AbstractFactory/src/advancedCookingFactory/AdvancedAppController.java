package advancedCookingFactory;

public class AdvancedAppController {
	
	DessertFactory df;
	
	public AdvancedAppController(DessertFactory df) {
		this.df = df;
	}
	
	public void createAllDeserts() {
		
		Pie pie = df.createPie();
		Cake cake = df.createCake();
		Pastry pastry = df.createPastry();
		
		pie.create();
		cake.create();
		pastry.create();
	}

	public static void main(String[] args) {
		
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		System.out.print("Create Pie\nEnter fruit (Apple, Banana, Cherry): ");
		String fruit = keyboard.next();
		
		DessertFactory df;
		
		switch(fruit) {
			case "Apple":
				df = new AppleFactory();
				break;
			case "Banana":
				df = new BananaFactory();
				break;
			case "Cherry":
				df = new CherryFactory();
				break;
			default:
				df = new AppleFactory();
		}
		
		AdvancedAppController ac = new AdvancedAppController(df);
		
		ac.createAllDeserts();
		
	}
}
