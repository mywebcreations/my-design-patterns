package decoratorDesignPattern.playground;

public class HDD extends ComputerDecorator {
	private Computer computer;
	
	public HDD(Computer c) {
		computer = c;
	}
	
	public String add() {
		return computer.add() + " and HDD";
	}
}
