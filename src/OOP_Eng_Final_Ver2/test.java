package OOP_Eng_Final_Ver2;

import java.util.*;

public class test {
	public static void main(String[] args) {
		TriangleManager tm = (TriangleManager) new testTriangle();
		Scanner sc = new Scanner(System.in);
		List<Triangle> list = new ArrayList<>();
		list.add(new Triangle("red", "triangle 1", 5, 6, 7, 3));
		list.add(new Triangle("blue", "triangle 2", 4, 6, 8, 5));
		while (true) {
			int index = 0;
			int choice = 0;
			System.out.print("input choice: ");
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
				case 1:
					System.out.println("input triangle: ");
					tm.input(list);
					break;
				case 2:
					System.out.println("display triangle: ");
					tm.display(list);
					break;
				case 4:
					System.out.println("The program ends");
					System.exit(4);
					break;
			}
			
		}
	}

}
