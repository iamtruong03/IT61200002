package objects;

public class Circle extends GeometricObject {

	private double radius;

	// contructor
	public Circle() {

	}

	public Circle(String colour, boolean filledln, double radius) {
		super(colour, filledln);
		this.radius = radius;
	}

	//
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public double findPerimeter() {
		// TODO Auto-generated method stub
		return 2 * this.radius * Math.PI;
	}

	//
	@Override
	public String toString() {
		return "Circle [R=" + radius + ", Area=" + this.findArea() + ", Peri=" + this.findPerimeter() + "]";
	}

}
