package strategieDesignPattern.vehicleSubClasses;

import strategieDesignPattern.Vehicle;
import strategieDesignPattern.interfaceImplementers.GoByFlyingAlgorithm;

public class Helicopter extends Vehicle {
	public Helicopter() {
		setGoAlgorithm(new GoByFlyingAlgorithm());  
	}

}
