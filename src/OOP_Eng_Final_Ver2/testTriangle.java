package OOP_Eng_Final_Ver2;

import java.util.*;

public class testTriangle implements TriangleManager {

	@Override
	public void input(List<Triangle> list) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Input colour: ");
		String colour = sc.nextLine();
		System.out.print("Input shape name: ");
		String shapeName = sc.nextLine();
		System.out.print("Input shape edge1: ");
		double edge1 = Double.parseDouble(sc.nextLine());
		System.out.print("Input shape edge2: ");
		double edge2 = Double.parseDouble(sc.nextLine());
		System.out.print("Input shape edge3: ");
		double edge3 = Double.parseDouble(sc.nextLine());
		System.out.print("Input shape height: ");
		double height = Double.parseDouble(sc.nextLine());
		
		Triangle t = new Triangle(colour, shapeName, edge1, edge2, edge3, height);
		list.add(t);

	}

	@Override
	public void display(List<Triangle> list) {
		// TODO Auto-generated method stub
		for (Triangle o : list) {
			System.out.println(o);
		}

	}

}
