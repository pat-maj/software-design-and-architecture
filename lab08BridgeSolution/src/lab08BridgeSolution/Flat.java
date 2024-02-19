package lab08BridgeSolution;

public class Flat extends Accommodation {

	private BuildingMaterial bm;
	
	public Flat(BuildingMaterial bm) {
		super("flat (1 layer Accommodation) of " + bm.getName());
		this.bm = bm;
	}

	@Override
	public void build() {
		bm.buildWithMaterials();
	}
}
