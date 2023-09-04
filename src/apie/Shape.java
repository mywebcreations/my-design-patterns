package apie;

public class Shape {
	private String type;
	
	public Shape(String type) {
		this.type = type;
	}
	
	public String draw() {
		return "This is a " + this.type;
	}
}
