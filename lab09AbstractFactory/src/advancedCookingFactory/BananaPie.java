package advancedCookingFactory;

public class BananaPie extends Pie{

	@Override
	public void printCreated() {
		System.out.println("Banana Pie created");
	}

	@Override
	public void addFruit() {
		System.out.println("...add mashed up bananas");
	}

	@Override
	public void bake() {
		System.out.println("...baking at 200C");
	}
}
