package sda.diProblem.business;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.UUID;

public class MapOrderRepository extends AbstractOrderRepository {

	private final Map<UUID, Order> map = new HashMap<UUID, Order>();
	
	@Override
	public void put(Order order) {
		map.put(order.getId(), order);
	}

	@Override
	public Order get(UUID id) {
		return map.get(id);
	}

	@Override
	public Collection<Order> values() {
		return map.values();
	}

}
