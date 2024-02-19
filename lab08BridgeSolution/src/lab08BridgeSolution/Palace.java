package lab08BridgeSolution;

public class Palace extends Accommodation {

	BuildingMaterial bm;
	
	public Palace(BuildingMaterial bm) {
		super("palace (5 layer Accommodation) of " + bm.getName());
		this.bm = bm;
	}

	@Override
	public void build() {
		bm.buildWithMaterials();
		bm.buildWithMaterials();
		bm.buildWithMaterials();
		bm.buildWithMaterials();
		bm.buildWithMaterials();
	}

}
