package strategieDesignPattern.vehicleSubClasses;

import strategieDesignPattern.Vehicle;
import strategieDesignPattern.interfaceImplementers.GoByDrivingFastAlgorithm;

public class FormulaOne extends Vehicle {
	public FormulaOne() {
		setGoAlgorithm(new GoByDrivingFastAlgorithm());
	}
}
