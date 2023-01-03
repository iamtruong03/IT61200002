package OOP_English_Final;

public abstract class TwoDShape {
	public String colour;
	public String shapeName;

	//
	public TwoDShape() {

	}

	public TwoDShape(String colour, String shapeName) {
		super();
		this.colour = colour;
		this.shapeName = shapeName;
	}

	//
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	//
	@Override
	public String toString() {
		return "TwoDShape [colour=" + colour + ", shapeName=" + shapeName + "]";
	}

}
