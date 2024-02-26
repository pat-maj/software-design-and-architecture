package advancedCookingFactory;

public class CherryFactory extends DessertFactory {

	@Override
	public Pie createPie() {
		return new CherryPie();
	}

	@Override
	public Pastry createPastry() {
		return new CherryPastry();
	}

	@Override
	public Cake createCake() {
		return new CherryCake();
	}
}
