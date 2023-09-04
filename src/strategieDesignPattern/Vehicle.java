package strategieDesignPattern;

public class Vehicle {
	private GoAlgorithm goAlgorithm;
	
	public Vehicle() {
		
	}
	
	public void setGoAlgorithm(GoAlgorithm goAlgorithm) {
		this.goAlgorithm = goAlgorithm;
	}
	
	public void go() {
		goAlgorithm.go();
	}
}
