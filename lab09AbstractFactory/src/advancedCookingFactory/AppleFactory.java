package advancedCookingFactory;

public class AppleFactory extends DessertFactory {

	@Override
	public Pie createPie() {
		return new ApplePie();
	}

	@Override
	public Pastry createPastry() {
		return new ApplePastry();
	}

	@Override
	public Cake createCake() {
		return new AppleCake();
	}

}
