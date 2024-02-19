package lab08BridgeSolution;

public abstract class Accommodation {
	 
	public Accommodation(String plan) {
			System.out.println("...there was a plan to build a " + plan);
	}
	
	public abstract void build();
}
