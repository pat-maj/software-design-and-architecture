package advancedCookingFactory;

public abstract class Pastry {
	
	public abstract void printCreated();
	public abstract void addFruit();
	public abstract void bake();
	
	public void create() {
		printCreated();
		addFruit();
		bake();
	}
}
