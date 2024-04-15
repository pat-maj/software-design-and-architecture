package sda.productCache.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import sda.productCache.business.AbstractProductRepository;
import sda.productCache.business.Product;

public class ProductDatabase extends AbstractProductRepository {

	List<Product> products = new ArrayList<Product>();

	public static ProductDatabase Create(Product[] products)
	{
		return Create(List.of(products));
	}


	static ProductDatabase Create(Iterable<Product> products)
	{
		ProductDatabase database = new ProductDatabase();
		if(products != null) {			
			for (Product product : products) {
				database.put(product);
			}
		}
		return database;
	}

	ProductDatabase()
	{
	}
	
	
	@Override
	public void put(Product product) {
		
		if(!get(product.id()).isPresent())
		{
			products.add(product);
		}
	}

	@Override
	public Optional<Product> get(int id) {
		//Linear search, will be O(n) 
		for (Product product : products) {
			if(product.id() == id)
			{
				return Optional.of(product);
			}
		}
		return Optional.empty();
	}



}
