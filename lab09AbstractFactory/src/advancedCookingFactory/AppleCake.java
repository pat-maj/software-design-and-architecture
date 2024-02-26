package advancedCookingFactory;

public class AppleCake extends Cake{

	@Override
	public void printCreated() {
	    System.out.println("Apple Cake created");	
	}

	@Override
	public void addFruit() {
		System.out.println("...add layer of apple slices");
	}

	@Override
	public void bake() {
		System.out.println("...baking at 220C");
	}
}
