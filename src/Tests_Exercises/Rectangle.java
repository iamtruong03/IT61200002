package Tests_Exercises;

public class Rectangle extends Shape {

	private double width;
	private double length;

	// contructor
	public Rectangle() {

	}

	public Rectangle(String colour, String shape_type, double width, double length) {
		super(colour, shape_type);
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
		return width * length;
	}

	@Override
	public double findPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + length);
	}

	// to String
}
