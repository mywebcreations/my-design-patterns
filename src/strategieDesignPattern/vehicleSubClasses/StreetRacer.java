package strategieDesignPattern.vehicleSubClasses;

import strategieDesignPattern.Vehicle;
import strategieDesignPattern.interfaceImplementers.GoByDrivingAlgorithm;

public class StreetRacer extends Vehicle {
	public StreetRacer() {
		setGoAlgorithm(new GoByDrivingAlgorithm());
	}
	
}
