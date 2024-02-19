package lab08BridgeSolution;

public class StoryTeller {

	public static void main(String[] args) {

		System.out.println("Once upon a time...");
		// House can be made of: straw, sticks, brick
		
		Accommodation house1 = new House(new Bricks());
		Accommodation house2 = new House(new Sticks());
		Accommodation house3 = new House(new Straw());
		
		// build each house
		house1.build();
		house2.build();
		house3.build();

		// Flat can be made of: straw, sticks, brick
		Accommodation flat1 = new Flat(new Bricks());
		Accommodation flat2 = new Flat(new Sticks());
		Accommodation flat3 = new Flat(new Straw());
		
		// build each house
		flat1.build();
		flat2.build();
		flat3.build();

	}

}
