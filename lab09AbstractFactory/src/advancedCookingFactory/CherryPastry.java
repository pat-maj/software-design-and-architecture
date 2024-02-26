package advancedCookingFactory;

public class CherryPastry extends Pastry {

	@Override
	public void printCreated() {
		System.out.println("Cherry Pastry created");
	}

	@Override
	public void addFruit() {
		System.out.println("...squeeze cherry paste");
	}

	@Override
	public void bake() {
		System.out.println("...baking slowly at 180C");
	}
}
