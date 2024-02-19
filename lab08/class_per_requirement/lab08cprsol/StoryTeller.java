package lab08cprsol;
import lab08isol.FlatOfBricks;
import lab08isol.FlatOfSticks;
import lab08isol.FlatOfStraw;
import lab08isol.HouseOfBricks;
import lab08isol.HouseOfSticks;
import lab08isol.HouseOfStraw;

public class StoryTeller {
    public static void main(String[] args) {
	System.out.println("Once upon a time...");
	// House can be made of: straw, sticks, brick
	HouseOfStraw house1 = new HouseOfStraw();
	HouseOfSticks house2 = new HouseOfSticks();
	HouseOfBricks house3 = new HouseOfBricks();
	// build each house
	house1.build();
	house2.build();
	house3.build();
	// Flat can be made of: straw, sticks, brick
	FlatOfStraw flat1 = new FlatOfStraw();
	FlatOfSticks flat2 = new FlatOfSticks();
	FlatOfBricks flat3 = new FlatOfBricks();
	// build each flat
	flat1.build();
	flat2.build();
	flat3.build();
    }
}
	    
