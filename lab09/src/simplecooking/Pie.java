package simplecooking;

public class Pie {


	public Pie() {
	}

	public Pie(String fruit) {
		System.out.println("Pretty Pie time!");
		switch (fruit) {
		case "Apple":
			new ApplePie();
			break;
		case "Banana":
			new BananaPie();
			break;
		}
		// but we then need a method to return the actual pie?
	}
}
