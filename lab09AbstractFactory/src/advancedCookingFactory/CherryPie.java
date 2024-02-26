package advancedCookingFactory;

public class CherryPie extends Pie{

	@Override
	public void printCreated() {
		System.out.println("Cherry Pie created");
	}

	@Override
	public void addFruit() {
		System.out.println("...add a cherry on the top");
	}

	@Override
	public void bake() {
		System.out.println("...baking at 200C");
	}
}
