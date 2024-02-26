package advancedcooking;
public class CherryPastry extends Pastry {
    public void printCreated() {
	System.out.println("Cherry Pastry created");
    }

    // use relevant fruit
    public void addFruit() {
	System.out.println("...squeeze cherry paste");
    }

    // bake all pastries similarly
    public void bake() {
	System.out.println("...baking slowly at 180C");
    }
}
