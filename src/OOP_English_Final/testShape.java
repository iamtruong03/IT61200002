package OOP_English_Final;

import java.util.*;

public class testShape {

	public static void Input(Triangle[] t) {

	}

	public static void Display(Triangle[] t) {

	}

	public static void SortByTheArea(Triangle[] t) {

	}

	public static void Menu(Triangle[] t) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int option = 0;
			System.out.println("----------MENU-----------");
			System.out.println("(1) - Nhap");
			System.out.println("(2) - Hien thi");
			System.out.println("(3) - Sap xep theo dien tich:");
			System.out.println("(4) - Thoat chuong trinh.");
			System.out.print("Nhap lua chon cua ban: ");
			option = sc.nextInt();

			switch (option) {
			case 1:
				testShape.Input(t);
				break;
			case 2:
				testShape.Display(t);
				break;
			case 3:
				testShape.SortByTheArea(t);
				break;
			case 4:
				return;
			default:
				System.out.println("Lua chon khong hop le. Vui long nhap lai!");
			}
		}

	}

	public static void main(String[] args) {
		testShape test_sahpeShape = new testShape();
		Triangle t = new Triangle();
		testShape.Menu(null);

	}

}
