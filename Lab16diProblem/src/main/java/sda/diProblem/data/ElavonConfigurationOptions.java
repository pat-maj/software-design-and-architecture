package sda.diProblem.data;

import com.google.inject.Singleton;

public class ElavonConfigurationOptions {
	
	private String merchCode;


	public ElavonConfigurationOptions(String merchCode)
	{
		this.merchCode = merchCode;
		
	}
	
	
	public String getMerchantCode()
	{
		return merchCode;
	}

}
