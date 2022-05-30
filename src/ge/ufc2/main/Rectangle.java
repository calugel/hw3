package ge.ufc2.main;



public class Rectangle {

	//field variables
	
	private double width;
	private double length;
	
	
	
	//setter methods
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	
	
	//getter methods
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	protected double getPerimeter() {
		return 2 * (width + length);
	}
	
	
	
	// TASK 5 *********************************************
	
	//comparison of two rectangles
	
	public int Comparison(Rectangle rectangle1, Rectangle rectangle2) {
		
		if (rectangle1.getPerimeter() < 0 || rectangle2.getPerimeter() < 0) {
			return 404;  // error
		}
		
		if (rectangle1.getPerimeter() > rectangle2.getPerimeter()) {
			return 1;
		}else if(rectangle1.getPerimeter() < rectangle2.getPerimeter()) {
			return -1;
		}
		
		return 0;
	}
	
}
