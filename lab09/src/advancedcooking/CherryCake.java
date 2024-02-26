package advancedcooking;
public class CherryCake extends Cake {
    public void printCreated() {
	System.out.println("The most flavoursome Cherry Cake crated");
    }

    // use relevant fruit
    public void addFruit() {
	System.out.println("...add lots of glace cherries");
    }

    // bake all cakes similarly
    public void bake() {
	System.out.println("...baking at 220C");
    }
}
