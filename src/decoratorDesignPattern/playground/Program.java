package decoratorDesignPattern.playground;

public class Program {
	
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer = new HDD(computer);
		computer = new SSD(computer);
		computer = new SDCardReader(computer);
		computer = new OpticalDrive(computer);
		
		System.out.println(computer.add());
	}
}
