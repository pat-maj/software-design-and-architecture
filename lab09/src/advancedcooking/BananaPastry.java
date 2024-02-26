package advancedcooking;
public class BananaPastry extends Pastry {
    public void printCreated() {
	System.out.println("Banana Pastry created");
    }

    // use relevant fruit
    public void addFruit() {
	System.out.println("...slice bananas on top");
    }

    // bake all pastries similarly
    public void bake() {
	System.out.println("...baking slowly at 180C");
    }
}
