package abstractFactoryDesignPattern.product;

import abstractFactoryDesignPattern.entity.ConfigurationEntity;
import abstractFactoryDesignPattern.entity.HPConfigurationEntity;

public class HPConfiguration extends Configuration {
	public ConfigurationEntity getConfigurationEntity() {
		return new HPConfigurationEntity();
	}
}
