package advancedcooking;
public class BananaPie extends Pie {
    public void printCreated() {
	System.out.println("Banana Pie created");
    }

    // use relevant fruit
    public void addFruit() {
	System.out.println("...add mashed up bananas");
    }

    // bake all pies similarly
    public void bake() {
	System.out.println("...baking at 200C");
    }

}
