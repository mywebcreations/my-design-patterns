package abstractFactoryDesignPattern;

import abstractFactoryDesignPattern.product.Configuration;
import abstractFactoryDesignPattern.product.Operation;

abstract public class SystemManagerFactory {
	
	abstract public Configuration createConfiguration();
	
	abstract public Operation createOperation();
}
