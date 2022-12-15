package Tests_Exercises;

public class Square extends Rectangle {
	private double edge;

	// contructor
	public Square() {

	}

	public Square(String colour, String shape_type, double width, double length, double edge) {
		super(colour, shape_type, edge, edge);
		this.edge = edge;
	}

	// getter and setter
	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}

}
