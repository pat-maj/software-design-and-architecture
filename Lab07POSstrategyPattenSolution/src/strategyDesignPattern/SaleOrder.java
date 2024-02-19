package strategyDesignPattern;

public class SaleOrder {
	private float total;
	private int numItems;
    private final TaxHelper TaxHelper;
    
    public SaleOrder(TaxHelper TaxHelper) {
	System.out.println("new SaleOrder\nzero everything");
	this.total = 0;
	this.numItems = 0;
	this.TaxHelper = TaxHelper;
    }
    public void addItem(float value) {
	total += value;
	numItems++;
    }
    public float calcTax() {
    	return TaxHelper.calculateTax(total);
    }
    public float calcTotalCost() {
	return total + calcTax();
    }
}
