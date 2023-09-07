package decoratorDesignPattern.playground;

public class SDCardReader extends ComputerDecorator {
	private Computer computer;
	
	public SDCardReader(Computer c) {
		computer = c;
	}
	
	public String add() {
		return computer.add() + " and SDCardReader";
	}
}
