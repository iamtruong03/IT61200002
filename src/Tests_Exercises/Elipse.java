package Tests_Exercises;

public abstract class Elipse extends Shape {

	private double large_radius;
	private double small_radius;

	// contructor
	public Elipse() {

	}

	public Elipse(String colour, String shape_type, double large_radius, double small_radius) {
		super(colour, shape_type);
		this.large_radius = large_radius;
		this.small_radius = small_radius;
	}

	// getter and setter
	public double getLarge_radius() {
		return large_radius;
	}

	public void setLarge_radius(double large_radius) {
		this.large_radius = large_radius;
	}

	public double getSmall_radius() {
		return small_radius;
	}

	public void setSmall_radius(double small_radius) {
		this.small_radius = small_radius;
	}
	
	//
	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return Math.PI * this.large_radius * this.small_radius;
	}

	@Override
	public double findPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// to String

}
