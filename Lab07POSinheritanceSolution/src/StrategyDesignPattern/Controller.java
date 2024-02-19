package StrategyDesignPattern;

public class Controller {
    public static void main(String[] args) {
	System.out.println("Controller boots...");
	float total = 0;
	
	// create a new SaleOrder
	SaleOrder sale1 = new SaleOrder();
	
	// add arbritary item of value 'cost'  to our SaleOrder item
	float cost1=80.00f;
	float cost2=70.00f;
	float cost3=20.00f;
	sale1.addItem(cost1);
	// add another item
	sale1.addItem(cost2);
	sale1.addItem(cost3);

	// find UK tax for total sale
	float USTax = sale1.calcTax("US");
	total += sale1.calcTotalCost();
	sale1.clearSaleOrder();
	
	sale1.addItem(cost1);
	sale1.addItem(cost2);
	sale1.addItem(cost3);
	
	float UKTax = sale1.calcTax("UK");
	total += sale1.calcTotalCost();
	sale1.clearSaleOrder();
	
	sale1.addItem(cost1);
	sale1.addItem(cost2);
	sale1.addItem(cost3);
	
	float EUTax = sale1.calcTax("EU");
	total += sale1.calcTotalCost();
	sale1.clearSaleOrder();
	
	System.out.println("Total cost:" + total + " of which: UK tax = " + UKTax + ", US tax = " + USTax + ", EU tax = " + EUTax);
    }
}