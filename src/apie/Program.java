package apie;

public class Program {
	public static void main(String[] args) {
		Shape shape = new Shape("Shape Object");
		System.out.println(shape.draw());
		
		shape = new Rectangle("Rectangle Object");
		System.out.println(shape.draw());
	}

}
