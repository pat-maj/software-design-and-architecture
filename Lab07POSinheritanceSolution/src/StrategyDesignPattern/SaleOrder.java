package StrategyDesignPattern;

public class SaleOrder {
    float total;
    int numItems;
    // set UK tax (i.e. VAT) rate (20%)
    float taxRate;
    public SaleOrder() {
	System.out.println("new SaleOrder\nzero everything");
	this.total = 0;
	this.numItems = 0;
    }
    public void addItem(float value) {
	total += value;
	numItems++;
    }
    public float calcTax(String country) {
    	switch(country) {
		case "US":
			taxRate = 0.15f;
			break;
		case "EU":
			taxRate = 0.33f;
			break;
		case "UK":
			taxRate = 0.2f;
			break;
		default:
			taxRate = 0;
	}
	
	return taxRate * total;
    }
    public float calcTotalCost() {
	return total;
    }
	
    public void clearSaleOrder() {
    	total = 0;
    	numItems = 0;
    }
}
