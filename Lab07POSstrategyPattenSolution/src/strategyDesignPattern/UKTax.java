package strategyDesignPattern;

public class UKTax extends TaxHelper {

	@Override
	public float calculateTax(float amount) {
		return amount * 0.2f;
	}

}
