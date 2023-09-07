package abstractFactoryDesignPattern;

import abstractFactoryDesignPattern.product.Configuration;
import abstractFactoryDesignPattern.product.Operation;
import abstractFactoryDesignPattern.product.IBMConfiguration;
import abstractFactoryDesignPattern.product.IBMOperation;

public class IBMSystemManagerFactory extends SystemManagerFactory {
	public Configuration createConfiguration() {
		return new IBMConfiguration();
	}
	
	public Operation createOperation() {
		return new IBMOperation();
	}

}
