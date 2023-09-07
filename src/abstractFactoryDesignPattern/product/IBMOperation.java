package abstractFactoryDesignPattern.product;

import abstractFactoryDesignPattern.entity.IBMOperationEntity;
import abstractFactoryDesignPattern.entity.OperationEntity;


public class IBMOperation extends Operation {

	@Override
	public OperationEntity getOperationEntity() {
		return new IBMOperationEntity();
	}

}
