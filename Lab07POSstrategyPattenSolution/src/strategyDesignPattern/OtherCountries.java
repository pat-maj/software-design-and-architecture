package strategyDesignPattern;

public class OtherCountries extends TaxHelper {

	@Override
	public float calculateTax(float amount) {
		return 0.0f;
	}

}