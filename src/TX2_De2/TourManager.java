package TX2_De2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public interface TourManager {

	// Them
	public boolean addTour(Tour t);

	// Sua
	public boolean editTour(Tour t);

	// Xoa
	public boolean delTour(Tour t);

	// Tim kiem theo ten
//	public List<Tour> searchTour(String name);
	public static ArrayList<Tour> searchTour(Tour[] list, String name) {
		// khai bao va khoi tao
		ArrayList<Tour> results = new ArrayList<>();

		// ghi nhan ket qua
		for (Tour t : list) {
			if (t.getProduct_name().toLowerCase().contains(name.toLowerCase())) {
				results.add(t);
			}
		}

		return results;
	}

	// Sap xep thep gia
//	public List<Tour> sortedTour(double price);
	public static ArrayList<Tour> sortedTour(Tour[] list, double price) {
		// Khaia bao mang dong
		ArrayList<Tour> tmp = new ArrayList<>();

		// sao chep du lieu vao mang ten
		Collections.addAll(tmp, list);

		// sap xep

		return tmp;
	}

}
