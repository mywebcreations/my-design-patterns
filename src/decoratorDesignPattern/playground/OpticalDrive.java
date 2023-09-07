package decoratorDesignPattern.playground;

public class OpticalDrive extends ComputerDecorator {
	private Computer computer;
	
	public OpticalDrive(Computer c) {
		computer = c;
	}
	
	public String add() {
		return computer.add() + " and Optical Drive";
	}
}
