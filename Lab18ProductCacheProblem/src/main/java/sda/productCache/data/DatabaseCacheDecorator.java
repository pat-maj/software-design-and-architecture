package sda.productCache.data;

import java.util.Optional;

import sda.productCache.business.AbstractProductRepository;
import sda.productCache.business.Product;

public class DatabaseCacheDecorator extends AbstractProductRepository{
	
	

//	@Override
	public Optional<Product> get(int id) {
//		//Linear search, will be O(n) 
//		for (Product product : products) {
//			if(product.id() == id)
//			{
//				return Optional.of(product);
//			}
//		}
		return Optional.empty();
	}
//
//	@Override
	public void put(Product product) {
//		// TODO Auto-generated method stub
//		
	}
}
