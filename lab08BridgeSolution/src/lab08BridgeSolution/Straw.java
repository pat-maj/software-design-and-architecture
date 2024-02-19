package lab08BridgeSolution;

public class Straw implements BuildingMaterial {

	@Override
	public void buildWithMaterials() {
		System.out.println("Piggy stacks straw bales on top of each other");
	}

	@Override
	public String getName() {
		return "Straw";
	}
}
