package Tests_Exercises;

public abstract class Shape {
	protected String colour;
	protected String shape_type;

	// contructor
	public Shape() {

	}

	public Shape(String colour, String shape_type) {
		super();
		this.colour = colour;
		this.shape_type = shape_type;
	}

	// tuong minh
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getShape_type() {
		return shape_type;
	}

	public void setShape_type(String shape_type) {
		this.shape_type = shape_type;
	}

	// truu tuong
	public abstract double findArea();
	public abstract double findPerimeter();
	//public abstract double 

}
