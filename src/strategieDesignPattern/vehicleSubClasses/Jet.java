package strategieDesignPattern.vehicleSubClasses;

import strategieDesignPattern.Vehicle;
import strategieDesignPattern.interfaceImplementers.GoByFlyingFastAlgorithm;

public class Jet extends Vehicle {
	public Jet() {
		setGoAlgorithm(new GoByFlyingFastAlgorithm());
	}
}
