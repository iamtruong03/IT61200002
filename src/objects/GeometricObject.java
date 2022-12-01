package objects;

public abstract class GeometricObject {

	protected String colour;
	protected boolean filledln;

	// contructor
	public GeometricObject(String colour, boolean filledln) {
		super();
		this.colour = colour;
		this.filledln = filledln;
	}

	// Gọi là phương thưc tường minh
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	// gọi là phương thức trừu tượng
	public abstract double findArea();
	public abstract double findPerimeter();

}
