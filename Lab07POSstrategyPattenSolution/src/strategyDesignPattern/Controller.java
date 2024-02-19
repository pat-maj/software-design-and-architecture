package strategyDesignPattern;

public class Controller {
	 public static void main(String[] args) {
		System.out.println("Controller boots...");
	
		// create a new SaleOrder
		SaleOrder uk = new SaleOrder(new UKTax());
		SaleOrder us = new SaleOrder(new USTax());
		SaleOrder eu = new SaleOrder(new EUTax());
		SaleOrder others = new SaleOrder(new OtherCountries());
		
		// add arbritary item of value 'cost'  to our SaleOrder item
		float cost1 = 80.00f;
		float cost2 = 20.00f;
		float cost3 = 70.00f;
		
		
		uk.addItem(cost1);
		uk.addItem(cost2);
		uk.addItem(cost3);
	
		float UKtax = uk.calcTax();
		

		us.addItem(cost1);
		us.addItem(cost2);
		us.addItem(cost3);
	
		float UStax = us.calcTax();
		

		eu.addItem(cost1);
		eu.addItem(cost2);
		eu.addItem(cost3);
	
		float EUtax = eu.calcTax();
		

		others.addItem(cost1);
		others.addItem(cost2);
		others.addItem(cost3);
	
		float OtherCountriesTax = others.calcTax();
	
		System.out.println("Total cost:" + (uk.calcTotalCost() + us.calcTotalCost() + eu.calcTotalCost() + others.calcTotalCost()) + " of which UK tax = " + UKtax + ", US tax = " + UStax + ", EU tax = " + EUtax + ", others tax = " + OtherCountriesTax);
	 }
}
