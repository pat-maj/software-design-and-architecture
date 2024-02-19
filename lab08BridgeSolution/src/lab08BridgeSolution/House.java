package lab08BridgeSolution;

public class House extends Accommodation {

	BuildingMaterial bm;
	
	public House(BuildingMaterial bm) {
		super("house (TWO layer Accommodation) of " + bm.getName());
		this.bm = bm;
	}

	@Override
	public void build() {
		bm.buildWithMaterials();
		bm.buildWithMaterials();
	}

}
