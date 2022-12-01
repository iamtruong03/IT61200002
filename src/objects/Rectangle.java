package objects;

public class Rectangle extends GeometricObject {
	
	private double width;
	private double length;

	// contructor
	public Rectangle(String colour, boolean filledln ,double width, double length) {
		super(colour,filledln );
		this.width = width;
		this.length = length;
	}
	
	// getter and setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double findPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// to string
	

}
