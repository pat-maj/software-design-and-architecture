package advancedCookingFactory;

public class ApplePie extends Pie {

	@Override
	public void printCreated() {
	    System.out.println("Apple Pie created");	
	}

	@Override
	public void addFruit() {
		System.out.println("...add chopped up apple chunks");
	}

	@Override
	public void bake() {
		System.out.println("...baking at 200C");
	}
}
