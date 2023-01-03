package OOP_English_Final;

public class Square extends TwoDShape implements Shape {

	public double length;

	// 
	public Square() {

	}

	public Square(String colour, String shapeName, double length) {
		super(colour, shapeName);
		this.length = length;
	}

	//
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	// 
	@Override
	public String toString() {
		return "Square [length=" + length + "]";
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
