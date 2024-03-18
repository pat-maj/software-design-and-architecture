package sda.diProblem;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import sda.diProblem.business.AbstractCreditCardService;
import sda.diProblem.business.AbstractLogger;
import sda.diProblem.business.AbstractOrderRepository;
import sda.diProblem.business.FakeLogger;
import sda.diProblem.business.MapOrderRepository;
import sda.diProblem.business.RealLogger;
import sda.diProblem.data.ElavonConfigurationOptions;
import sda.diProblem.data.ElavonCreditCardService;
import sda.diProblem.data.FakeCreditCardServiceSuccess;

public class ConfigurationModule extends AbstractModule {

	 protected void configure() {
	     bind(AbstractCreditCardService.class).to(ElavonCreditCardService.class);
	     bind(AbstractLogger.class).to(FakeLogger.class);
	     bind(AbstractOrderRepository.class).to(MapOrderRepository.class);
	 }
 
	 
	 @Provides
	 ElavonConfigurationOptions provideElavonConfigurationOptions()
	 {
		 return new ElavonConfigurationOptions("Merch Code");
	 }
		
}
