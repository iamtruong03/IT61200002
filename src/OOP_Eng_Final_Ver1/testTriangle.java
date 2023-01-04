package OOP_Eng_Final_Ver1;

import java.util.*;

import OOP_Eng_Final_Ver2.Triangle;

public class testTriangle implements TriangleManager {

	private ArrayList<Triangle> list;

	public testTriangle() {
		this.list = new ArrayList<>();
	}

	@Override
	public boolean addTriangle(Triangle t) {
		// TODO Auto-generated method stub
		for (Triangle p : list) {
			if (p.getShapeName() == t.getShapeName()) {
				return false;
			}
		}
		return list.add(t);

	}

	@Override
	public void display(List<Triangle> list) {
		// TODO Auto-generated method stub
		for (Triangle o : list) {
			System.out.println(o);
			
		}

	}

	@Override
	public List<Triangle> sortedTriangle() {
		// TODO Auto-generated method stub
		Collections.sort(list);
		return list;
	}

}
