package sda.diProblem.business;

import java.util.UUID;

public class Order {
	
	private final UUID id;
	private final double amount;
	
	public Order(UUID id, double amount) {
		this.id = id;
		this.amount = amount;
	}
	
	public UUID getId() {
		return id;
	}
	
	public double getAmount() {
		return amount;
	}
}
