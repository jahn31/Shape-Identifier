package shapes;

import java.io.IOException;

public class Rectangle extends Parallelogram{
	
	public Rectangle(double width, double height) throws IOException {
		super(width, height);
		
	}
	
	public String toString() {
		return String.format("%s {w=" + getWidth()  +", h=" +  getLength() + "} perimeter = %g\n", "Rectangle", perimeter());
	}
}

