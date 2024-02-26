package advancedCookingFactory;

public class ApplePastry extends Pastry{

	@Override
	public void printCreated() {
	    System.out.println("Apple Pastry created");
	}

	@Override
	public void addFruit() {
		System.out.println("...squeeze apple mush on top");
	}

	@Override
	public void bake() {
		System.out.println("...baking slowly at 180C");
	}
}
