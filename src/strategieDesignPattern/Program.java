package strategieDesignPattern;

import strategieDesignPattern.interfaceImplementers.GoByDrivingAlgorithm;
import strategieDesignPattern.vehicleSubClasses.*;

public class Program {
	public static void main(String[] args) {
		Vehicle vehicle = new StreetRacer();
		System.out.println(vehicle.go());
		
		vehicle = new FormulaOne();
		System.out.println(vehicle.go());
		
		vehicle = new Helicopter();
		System.out.println(vehicle.go());
		
		vehicle = new Jet();
		System.out.println(vehicle.go());
		
	}

}
