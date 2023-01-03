package OOP_English_Final;

public class Triangle extends TwoDShape implements Shape {

	public double height;

	//
	public Triangle() {

	}

	public Triangle(String colour, String shapeName, double height) {
		super(colour, shapeName);
		this.height = height;
	}

	//
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// to String
	@Override
	public String toString() {
		return "Triangle [height=" + height + "]";
	}

	//
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
