package strategyDesignPattern;

public abstract class Strategy {

	private float total;
	private int numOfItems;
	private float taxRate;
	
	public Strategy() {
		this.total = 0;
		this.numOfItems = 0;
	}
	
	public void addItem(float value) {
		total += value;
		numOfItems++;
	}
	
	public float calcTotalCost() {
		return total;
	}
	
	public abstract float calcTax();
}
