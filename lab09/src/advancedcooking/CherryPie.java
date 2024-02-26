package advancedcooking;
public class CherryPie extends Pie {
    public void printCreated() {
	System.out.println("Cherry Pie created");
    }

    // use relevant fruit
    public void addFruit() {
	System.out.println("...add a cherry on the top");
    }

    // bake all pies similarly
    public void bake() {
	System.out.println("...baking at 200C");
    }

}
