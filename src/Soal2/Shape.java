package Soal2;

public class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {
		this.color = "yellow";
		this.filled = true;
	}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		String filled = (this.filled) ? "filled" : "not filled";
		return "A shape with color of" + this.color + "and" + filled;
	}
	
}
