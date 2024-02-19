package lab08BridgeSolution;

public class Sticks implements BuildingMaterial {

	@Override
	public void buildWithMaterials() {
		System.out.println("Piggy bundles sticks together");
	}

	@Override
	public String getName() {
		return "Straw";
	}
}
