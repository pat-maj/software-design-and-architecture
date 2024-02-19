package strategyDesignPattern;

public class EUTax extends TaxHelper {

	@Override
	public float calculateTax(float amount) {
		return amount * 0.33f;
	}

}
