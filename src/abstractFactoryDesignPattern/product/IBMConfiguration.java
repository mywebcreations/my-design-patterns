package abstractFactoryDesignPattern.product;

import abstractFactoryDesignPattern.entity.ConfigurationEntity;
import abstractFactoryDesignPattern.entity.IBMConfigurationEntity;

public class IBMConfiguration extends Configuration {
	
	public ConfigurationEntity getConfigurationEntity() {
		return new IBMConfigurationEntity();
	}

}
