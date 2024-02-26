package advancedcooking;
public class BananaCake extends Cake {
    public void printCreated() {
	System.out.println("Banana Cake created");
    }

    // use relevant fruit
    public void addFruit() {
	System.out.println("...add layer of sliced banana on pastry base");
    }

    // bake all cakes similarly
    public void bake() {
	System.out.println("...baking at 220C");
    }
}
