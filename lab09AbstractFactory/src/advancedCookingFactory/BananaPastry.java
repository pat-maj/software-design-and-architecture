package advancedCookingFactory;

public class BananaPastry extends Pastry {

	@Override
	public void printCreated() {
		System.out.println("Banana Pastry created");
	}

	@Override
	public void addFruit() {
		System.out.println("...slice bananas on top");
	}

	@Override
	public void bake() {
		System.out.println("...baking slowly at 180C");
	}
}
