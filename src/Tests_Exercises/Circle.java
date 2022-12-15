package Tests_Exercises;

public class Circle extends Elipse {
	private double radius;

	// contructor
	public Circle() {

	}

	public Circle(String colour, String shape_type, double large_radius, double small_radius, double radius) {
		super(colour, shape_type, large_radius, small_radius);
		this.radius = radius;
	}

	// getter and setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
