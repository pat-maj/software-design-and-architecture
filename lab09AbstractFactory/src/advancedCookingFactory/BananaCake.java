package advancedCookingFactory;

public class BananaCake extends Cake{

	@Override
	public void printCreated() {
		System.out.println("Banana Cake created");	
	}
	
	@Override
    public void addFruit() {
		System.out.println("...add layer of sliced banana on pastry base");
    }

    @Override
    public void bake() {
    	System.out.println("...baking at 220C");
    }
}
