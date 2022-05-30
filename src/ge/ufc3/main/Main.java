package ge.ufc3.main;


// we can import packages but because both package contains class Rectangle,
// its better to import one of them, or just call the Rectangle class by package name.

// import ge.ufc.main.Rectangle;
// import ge.ufc2.main.Rectangle;

public class Main {

	public static void main(String[] args) {

		// we can use import instead of package name
		
		ge.ufc.main.Rectangle r1 = new ge.ufc.main.Rectangle();
		r1.setLength(5);
		r1.setWidth(4);
		
		
		ge.ufc.main.Rectangle r2 = new ge.ufc.main.Rectangle();
		r2.setLength(100);
		r2.setWidth(1);
		
		// print output
		System.out.println(r1.Comparison(r2));
		
		
		
		
		// we can use import instead of package name (second package)
		
		ge.ufc2.main.Rectangle rectangle1 = new ge.ufc2.main.Rectangle();
		rectangle1.setLength(5);
		rectangle1.setWidth(5);
		
		ge.ufc2.main.Rectangle rectangle2 = new ge.ufc2.main.Rectangle();
		rectangle2.setLength(4);
		rectangle2.setWidth(4);
		
		// print output
		System.out.println(new ge.ufc2.main.Rectangle().Comparison(rectangle1,rectangle2));

	}

}
