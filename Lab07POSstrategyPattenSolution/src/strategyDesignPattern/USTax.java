package strategyDesignPattern;

public class USTax extends TaxHelper {

	@Override
	public float calculateTax(float amount) {
		return amount * 0.15f;
	}

}
