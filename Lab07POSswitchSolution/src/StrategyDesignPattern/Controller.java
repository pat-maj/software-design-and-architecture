package StrategyDesignPattern;

public class Controller {
    public static void main(String[] args) {
	System.out.println("Controller boots...");
	float total = 0;
	
	// create a new SaleOrder
	SaleOrder sale1 = new SaleOrder();
	UKTax uk = new UKTax();
	USTax us = new USTax();
	EUTax eu = new EUTax();
	
	// add arbritary item of value 'cost'  to our SaleOrder item
	float cost1=80.00f;
	float cost2=70.00f;
	float cost3=20.00f;
	
	sale1.addItem(cost1);
	// add another item
	sale1.addItem(cost2);
	sale1.addItem(cost3);
	
	// find UK tax for total sale
	float OthersTax = sale1.calcTax();
	total += sale1.calcTotalCost();
	
	
	us.addItem(cost1);
	us.addItem(cost2);
	us.addItem(cost3);
	
	// find UK tax for total sale
	float USTax = us.calcTax();
	total += us.calcTotalCost();
	
	uk.addItem(cost1);
	uk.addItem(cost2);
	uk.addItem(cost3);
	
	float UKTax = uk.calcTax();
	total += uk.calcTotalCost();
	
	eu.addItem(cost1);
	eu.addItem(cost2);
	eu.addItem(cost3);
	
	float EUTax = eu.calcTax();
	total += eu.calcTotalCost();
	
	System.out.println("Total cost:" + total + " of which: UK tax = " + UKTax + ", US tax = " + USTax + ", EU tax = " + EUTax + ", Other countries tax = " + OthersTax);
    }
}