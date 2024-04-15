package sda.productCache.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.google.gson.Gson;

import sda.productCache.business.AbstractProductRepository;
import sda.productCache.business.Product;

//Simple implementation of a product cache based on a Map
public class ProductCache extends AbstractProductRepository {

	private final Map<Integer, ProductCacheEntry> entries = new HashMap<Integer,ProductCacheEntry>();
	private final int TTL = 10; // seconds
	
	@Override
	public void put(Product product) {
		ProductCacheEntry entry = new ProductCacheEntry(product);
		entries.put(entry.getKey(), entry);
	}

	@Override
	public Optional<Product> get(int id) {
		Optional<ProductCacheEntry> entry = Optional.ofNullable(entries.getOrDefault(Integer.valueOf(id), null));
		
		if(entry.isPresent()) {
			LocalDateTime now = LocalDateTime.now();
			LocalDateTime createdTime = entry.get().getCreatedTime();
			
			// Check whether the Product isn't too stale
			if(Duration.between(createdTime, now).getSeconds() > TTL) {
				entry = Optional.empty();
			}
		}
		
		Optional<Product> product = Optional.ofNullable(entry.isPresent() ? entry.get().getProduct() : null);
		
		if(entry.isEmpty()) {
	    	ProductDatabase productDb;
			try {
				productDb = createDatabase();
				product = productDb.get(id);
	    		if(product.isPresent()) {
	    			put(product.get());
	    		}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return product;
	}
	
	
	//Creates a new ProductDatabase by reading the JSON file products.json using the google Gson library
    public ProductDatabase createDatabase() throws IOException
    {
    	
    	try(InputStream stream = getClass().getClassLoader().getResourceAsStream("products.json"))
    	{
    		try(InputStreamReader reader = new InputStreamReader(stream))
    		{
	        	Gson gson = new Gson();
	        	return ProductDatabase.Create(gson.fromJson(reader, Product[].class));
    		}
    	} 
    }
}
