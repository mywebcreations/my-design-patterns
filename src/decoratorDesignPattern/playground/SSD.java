package decoratorDesignPattern.playground;

public class SSD extends ComputerDecorator {
	private Computer computer;
	
	public SSD(Computer c) {
		computer = c;
	}
	
	public String add() {
		return " and SSD ";
	}

}
