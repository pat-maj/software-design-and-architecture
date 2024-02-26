package advancedcooking;
public class AppleCake extends Cake {
   
    
    public void printCreated() {
    System.out.println("Apple Cake created");	
    }

    // use relevant fruit
    public void addFruit() {
	System.out.println("...add layer of apple slices");
    }

    // bake all cakes similarly
    public void bake() {
	System.out.println("...baking at 220C");
    }
}
