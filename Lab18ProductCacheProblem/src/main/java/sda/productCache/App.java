package sda.productCache;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;

import com.google.gson.Gson;

import sda.productCache.business.AbstractProductRepository;
import sda.productCache.business.Product;
import sda.productCache.data.ProductCache;
import sda.productCache.data.ProductDatabase;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        
        try {
			app.run();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public App()
    {
    	
    }
    
    public void run() throws IOException
    {
    	AbstractProductRepository cache = new ProductCache();
    	
    	//get product id = 1
      	Optional<Product> product1 = cache.get(1);
   	
    	System.out.println(product1.get());
    	
    	//get it again
    	product1 = cache.get(1);
        System.out.println(product1.get());
    	
    }
}
