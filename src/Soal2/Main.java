package Soal2;

public class Main {

	public static void main(String[] args) {
		Shape s1 = new Shape("green", false);
		System.out.println("Shape: " + s1.toString());		
		Circle c1 = new Circle();
		System.out.println("Circle: " + c1.toString());		
		Rectangle r1 = new Rectangle();
		System.out.println("Rectangle: " + r1.toString());		
		Square s2 = new Square(10.0);
		System.out.println("Square: " + s2.toString());
	}

}
