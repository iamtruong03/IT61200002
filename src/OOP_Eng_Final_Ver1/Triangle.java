package OOP_Eng_Final_Ver1;

public class Triangle extends TwoDShape implements Shape {

	//
	protected double edge1;
	protected double edge2;
	protected double edge3;
	protected double height;

	// contructor
	public Triangle() {

	}

	public Triangle(String colour, String shapeName, double edge1, double edge2, double edge3, double height) {
		super(colour, shapeName);
		this.edge1 = edge1;
		this.edge2 = edge2;
		this.edge3 = edge3;
		this.height = height;
	}

	// getter and setter
	public double getEdge1() {
		return edge1;
	}

	public void setEdge1(double edge1) {
		this.edge1 = edge1;
	}

	public double getEdge2() {
		return edge2;
	}

	public void setEdge2(double edge2) {
		this.edge2 = edge2;
	}

	public double getEdge3() {
		return edge3;
	}

	public void setEdge3(double edge3) {
		this.edge3 = edge3;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// to String
	@Override
	public String toString() {
		return "Triangle [" + super.toString() + ",edge1= " + edge1 + ", edge2= " + edge2 + ", edge3= " + edge3
				+ ", height=" + height + "]";
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
		return edge1 + edge2 + edge3;
	}

	public double compareTo(Triangle o) {
		// TODO Auto-generated method stub
		return this.getArea() - o.getArea();
	}

}
