package sda.diProblem.business;

import java.util.Collection;
import java.util.UUID;

public abstract class AbstractOrderRepository {
	
	public abstract void put(Order order);
	public abstract Order get(UUID id);
	public abstract Collection<Order> values();
}
