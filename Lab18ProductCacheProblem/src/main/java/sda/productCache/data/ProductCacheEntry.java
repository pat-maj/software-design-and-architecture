package sda.productCache.data;

import java.time.LocalDateTime;

import sda.productCache.business.Product;

//Represents an entry in the product cache
public class ProductCacheEntry
{
	private final Integer key;
	private final Product product;
	private final LocalDateTime createdTime;

	public ProductCacheEntry(Product product) {
		this.key = product.id();
		this.product = product;
		createdTime = LocalDateTime.now();
	}

	public Integer getKey() {
		return key;
	}

	public Product getProduct() {
		return product;
	}
	
	public LocalDateTime getCreatedTime() {
		return createdTime;
	}
}
