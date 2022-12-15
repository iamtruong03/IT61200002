package util;

import objects.Person;
import java.util.ArrayList; // sd mang de the hien cac thanh phan danh sach

public class MyArrays {
	/**
	 * Phương thức sinh ngãu nhiên giá trị cho mảng 1 chiều có n phàn tử
	 * 
	 * @param n - số pần tử của mảng 1 chiều
	 * @return - kết quả là mảng 1 chiều có giá trị <100
	 */
	public static int[] generateArray(int n) {
		// Khai báo mảng trung gian
		int[] arrInt = new int[n];
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = (int) (Math.random() * 100);
		}
		return arrInt;

	}

	public static Person[] generatePerson(int n) {
		// Khai bao danh sach trung gian
		Person[] list = new Person[n];

		// Danh sách tên:
		String[] firstName = { "Anh", "Anh Tuan", "Anh Truong", "Long", "Hai Anh", "Thuy", "Vu", "Hai" };
		// Danh sach ho
		String[] lastName = { "Le", "Nguyen", "Bui", "Dao", "Pham", "Tran", "Nong" };
		// Sinh gia tri
		int index;
		for (int i = 0; i < list.length; i++) {
			// Cap phat bo nho cho phan tu mang
			list[i] = new Person();

			// Sinh ngau nhien ten:
			index = (int) (Math.random() * firstName.length);
			list[i].setfirstName(firstName[index]);

			// Sinh ngau nhien ho:
			index = (int) (Math.random() * lastName.length);
			list[i].setlastName(lastName[index]);

			// Sinh ngau nhien tuoi:
			index = 18 + (int) (Math.random() * 5);
			list[i].setage((byte) index);
		}

		return list;

	}

//	public static tFashion[] generatetFashion(int n) {
//		
//	}

	public static void printArray(int[] arrInt) {
		// cách 1:
//		for(int = 0, i<arrInt.length,i++) {
//			System.out.print(arrInt[i++]+" ");
//		}

		// cách 2:
		for (int value : arrInt) {
			System.out.print(value + " ");
		}
		System.out.println();

	}

	public static void printPerson(Person[] list) {
		for (Person p : list) {
			System.out.println(p);
		}
	}

	public static void printPerson(ArrayList<Person> list) {
		// cach 2
//		for (Person p : list) {
//			System.out.println(p);
//		}

		// cach 3: Lambda java 8
		list.forEach(p -> System.out.println(p));

	}

	// equalsIgnoreCase la phuong thuc tim kiem chinh xac k phan biet hoa, thuong,
	// dung so tu
	// contains: la phuong thuc tim kiem k chinh xac, chuoi con trong chuoi me
	public static Person[] searchPerson(Person[] list, String name) {
		int count = 0;
		// khai bao mang luu tru ket qua
		Person[] results = null;

		// dem so ket qua
		for (Person p : list) {
			if (p.getfirstName().toLowerCase().contains(name.toLowerCase())) {
				count++;
			}
		}

		// khoi tao bo nho
		results = new Person[count];

		// ghi nhan ket qua
		count = 0;
		for (Person p : list) {
			if (p.getfirstName().toLowerCase().contains(name.toLowerCase())) {
				results[count] = p;
				count++;
			}
		}

		return results;
	}

	public static ArrayList<Person> searchPersonV2(Person[] list, String name) {
		// khai bao va khoi tao
		ArrayList<Person> results = new ArrayList<>();

		// ghi nhan ket qua
		for (Person p : list) {
			if (p.getfirstName().toLowerCase().contains(name.toLowerCase())) {
				results.add(p);
			}
		}

		return results;
	}

	public static void main(String[] args) {
		// Sinh mang
		int[] arrInt = MyArrays.generateArray(20);
		// in mang
		MyArrays.printArray(arrInt);

		Person[] list = MyArrays.generatePerson(8);
		MyArrays.printPerson(list);

		System.out.println("----------------------------------------------");

		// tim kiem
		// Person[] results = MyArrays.searchPerson(list, "Anh");
		ArrayList<Person> results = MyArrays.searchPersonV2(list, "Anh");
		MyArrays.printPerson(results);

	}

}
