package objects;

public class Circle extends GeometricObject {

	private double radius;

	//
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
		return 0;
	}

	@Override
	public double findPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", colour=" + colour + ", filledln=" + filledln + ", getRadius()="
				+ getRadius() + ", findArea()=" + findArea() + ", findPerimeter()=" + findPerimeter() + ", getColour()="
				+ getColour() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
