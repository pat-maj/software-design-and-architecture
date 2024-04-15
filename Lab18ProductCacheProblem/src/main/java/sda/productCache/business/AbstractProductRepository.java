package sda.productCache.business;

import java.util.Collection;
import java.util.Optional;

//Interface for a simple product data store
public abstract class AbstractProductRepository {

	public abstract void put(Product product);
	public abstract Optional<Product> get(int id);

	
}