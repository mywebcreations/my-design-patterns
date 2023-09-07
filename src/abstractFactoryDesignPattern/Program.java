package abstractFactoryDesignPattern;

import abstractFactoryDesignPattern.entity.ConfigurationEntity;
import abstractFactoryDesignPattern.entity.OperationEntity;
import abstractFactoryDesignPattern.product.Configuration;
import abstractFactoryDesignPattern.product.IBMConfiguration;
import abstractFactoryDesignPattern.product.Operation;

public class Program {
	public static void main(String[] args) {
		//instance factory
		IBMSystemManagerFactory iBMSystemManagerFactory = new IBMSystemManagerFactory();
		
		//get Configuration object (product)
		Configuration iBMConfiguration = iBMSystemManagerFactory.createConfiguration();
		
		//get configuration entity
		ConfigurationEntity iBMConfigurationEntity = iBMConfiguration.getConfigurationEntity();
		
		//display IBM Configuration
		System.out.println(iBMConfigurationEntity.getCpu());
		System.out.println(iBMConfigurationEntity.getGpu());
		System.out.println(iBMConfigurationEntity.getRam());
		
		
		//get Operation object (product)
		Operation iBMOperation = iBMSystemManagerFactory.createOperation();
		
		//get operation entity
		OperationEntity iBMOperationEntity = iBMOperation.getOperationEntity();
		
		//display IBM Operation
		System.out.println(iBMOperationEntity.getDeleteOperation());
		System.out.println(iBMOperationEntity.getReadOperation());
		System.out.println(iBMOperationEntity.getUpdateOperation());
		System.out.println(iBMOperationEntity.getWriteOperation());
	}
}
