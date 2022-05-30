package ge.ufc.main;



public class Rectangle {

	// field variables
	
		private double width;
		private double length;
		
//		**********************************************		
		
//		 constructor method
//
//		 public Rectangle(double width, double length) {
//		 	this.width = width;
//			this.length = length;
//		 }

//		************************************************
		
		
		
		// setter methods
		
		public void setWidth(double width) {
			this.width = width;
		}
		
		public void setLength(double length) {
			this.length = length;
		}
		
		
		
		// getter methods
		
		public double getWidth() {
			return width;
		}
		
		public double getLength() {
			return length;
		}
		
		
		
		
		// TASK 3 ****************************************
		
		// we can also use default access modificator instead of protected.
		
		protected double getArea() {
			return width * length;
		}
		
		protected double getPerimeter() {
			return 2 * (width + length);
		}
		
		
		
		
		// TASK 4 *****************************************
		
		// comparison of rectangles
		
		public int Comparison(Rectangle rectangle) {
			
			if(this.getArea() < 0 || rectangle.getArea() < 0) {
				return 404;  // error
			}
			
			
			if (this.getArea() > rectangle.getArea()) {
				return 1;
			}else if (this.getArea() < rectangle.getArea()) {
				return -1;
			}
			
			return 0;
			
			
		}
		
		
	
}
