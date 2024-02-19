package lab08BridgeSolution;

public class Bricks implements BuildingMaterial {

	@Override
	public void buildWithMaterials() {
		System.out.println("Piggy lays rows of bricks on top of each other");
	}

	@Override
	public String getName() {
		return "Bricks";
	}

}
