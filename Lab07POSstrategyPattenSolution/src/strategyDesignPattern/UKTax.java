package strategyDesignPattern;

public class UKTax extends Strategy {

	@Override
	public float calcTax() {
		return total * 0.2f;
	}

}
