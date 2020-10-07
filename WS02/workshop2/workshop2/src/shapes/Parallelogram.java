package shapes;

import java.io.IOException;


public class Parallelogram implements Shape{
	private double width;
	private double length;
	

	public Parallelogram(double width, double length) throws IOException{
		if(width > 0 && length > 0) {
			this.width = width;
			this.length = length;
		}
		else {
			throw new IOException("Invalid side!");
		}
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double perimeter() {
		return 2 * (getWidth() + getLength());
	}
	
	public String toString() {
		return String.format("%s {w=" + getWidth() +", h=" + getLength() + "} perimeter = %g\n", "Parallelogram",   perimeter());
	}
	
}
