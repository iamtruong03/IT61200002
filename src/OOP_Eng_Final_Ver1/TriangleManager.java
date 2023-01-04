package OOP_Eng_Final_Ver1;

import java.util.*;

import OOP_Eng_Final_Ver2.Triangle;

public interface TriangleManager {
	boolean addTriangle(Triangle t);

	public void display(List<Triangle> list);

	List<Triangle> sortedTriangle();

}
