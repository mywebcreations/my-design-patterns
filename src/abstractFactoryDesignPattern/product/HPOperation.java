package abstractFactoryDesignPattern.product;

import abstractFactoryDesignPattern.entity.HPOperationEntity;

public class HPOperation extends Operation {
	public HPOperationEntity getOperationEntity() {
		return new HPOperationEntity();
	}
}
