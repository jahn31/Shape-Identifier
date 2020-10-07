package shapes;

import java.io.IOException;

public class Circle implements Shape{
	double radius;
	
	public Circle(double radius) throws IOException{
		if(radius > 0) {
			this.radius = radius;
			
		}else { // only if radius is less than 0 
			throw new IOException("Invalid radius!");
		}
		
	}

	public double getRadius() {
		return radius;
	}

	public double perimeter() {
		return 2 * Math.PI * getRadius();
	}
	
	public String toString() {
		return String.format("%s {r=" + getRadius() + "} perimeter = %g\n", "Circle", perimeter());
	}
	

}
