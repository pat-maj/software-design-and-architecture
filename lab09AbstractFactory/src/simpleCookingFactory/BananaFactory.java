package simpleCookingFactory;

public class BananaFactory extends DessertFactory{

	@Override
	public Pie createPie() {
		return new BananaPie();
	}

	@Override
	public Pastry createPastry() {
		return new BananaPastry();
	}

	@Override
	public Cake createCake() {
		return new BananaCake();
	}
}
