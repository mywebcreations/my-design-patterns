package abstractFactoryDesignPattern;

import abstractFactoryDesignPattern.product.Configuration;
import abstractFactoryDesignPattern.product.Operation;
import abstractFactoryDesignPattern.product.HPConfiguration;
import abstractFactoryDesignPattern.product.HPOperation;

public class HPSystemManagerFactory extends SystemManagerFactory {
	
	public Configuration createConfiguration() {
		return new HPConfiguration();
	}
	
	public Operation createOperation() {
		return new HPOperation();
	}

}
