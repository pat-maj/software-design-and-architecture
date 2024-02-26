package advancedcooking;
public class ApplePie extends Pie {
    
    
    public void printCreated() {
    System.out.println("Apple Pie created");	
    }

    // use relevant fruit
    public void addFruit() {
	System.out.println("...add chopped up apple chunks");
    }

    // bake all pies similarly
    public void bake() {
	System.out.println("...baking at 200C");
    }

}
