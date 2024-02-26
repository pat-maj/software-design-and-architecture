package advancedCookingFactory;

public class CherryCake extends Cake{

	@Override
	public void printCreated() {
		System.out.println("The most flavoursome Cherry Cake crated");
	}

	@Override
	public void addFruit() {
		System.out.println("...add lots of glace cherries");
	}

	@Override
	public void bake() {
		System.out.println("...baking at 220C");
	}
}
