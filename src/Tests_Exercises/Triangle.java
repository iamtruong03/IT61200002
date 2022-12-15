package Tests_Exercises;

public class Triangle extends Shape {

	private double edge1;
	private double edge2;
	private double edge3;

	// contructor
	public Triangle() {

	}

	public Triangle(String colour, String shape_type, double edge1, double edge2, double edge3) {
		super(colour, shape_type);
		this.edge1 = edge1;
		this.edge2 = edge2;
		this.edge3 = edge3;
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

	//
	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double findPerimeter() {
		// TODO Auto-generated method stub
		return edge1 + edge2 + edge3;
	}
	
	// to string
}
