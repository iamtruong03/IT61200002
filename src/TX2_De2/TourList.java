package TX2_De2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TourList implements TourManager {
	// properties:
	private List<Tour> list;

	// Constructor
	public TourList() {
		list = new ArrayList<>();
	}

	public TourList(List<Tour> tour_list) {
		this.list = tour_list;
	}

	// In danh sách:
	public void printList() {
		for (Tour x : list) {
			System.out.println(x);
		}
	}

	@Override
	public boolean addTour(Tour t) {
		// Kiểm tra nếu trùng với mã tour đã có trong danh sách thì không cho add tour
		// đó vào ds.
		for (Tour x : list) {
			if (t.getProduct_id() == x.getProduct_id()) {
				return false;
			}
		}
		return list.add(t);
	}

	@Override
	public boolean editTour(Tour t) {
		int index = -1;
		for (Tour x : list) {
			// Nếu id trùng mới cho chỉnh sửa
			if (x.getProduct_id() == t.getProduct_id()) {
				index = list.indexOf(x);
			} else {
				continue;
			}
		}
		if (index != -1) {
			list.set(index, t);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delTour(Tour t) {
		int index = -1;
		for (Tour x : list) {
			// Xóa theo id vì id chỉ có 1
			if (x.getProduct_id() == t.getProduct_id()) {
				index = list.indexOf(x);
			}
		}
		if (index != -1) {
			list.remove(index);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Tour> searchTour(String name) {
		List<Tour> results = new ArrayList<>();
		for (Tour x : list) {
			if (x.getProduct_name().toLowerCase().contains(name.toLowerCase())) {
				results.add(x);
			}
		}
		return results;
	}

	@Override
	public List<Tour> sortedTour() {
		Collections.sort(list);
		return list;
	}

	// Main
	public static void main(String[] args) {
		TourList tour_list = new TourList();

		Tour tour1 = new Tour("11", "Tour Đà Nẵng", 1200, (short) 13, "Da nang", "2 ngày 2 đêm", "Da Nang Hotel");
		Tour tour2 = new Tour("22", "Tour Mộc Châu", 2000, (short) 10, "Moc Chau", "2 ngày 1 đêm", "Moc Chau Hotel");
		Tour tour3 = new Tour("33", "Tour Phú Quốc", 2300, (short) 12, "Phu Quoc", "4 ngày 3 đêm", "Phu Quoc Hotel");
		Tour tour4 = new Tour("44", "Tour Mộc Châu", 1000, (short) 13, "Moc Chau", "3 ngày 2 đêm", "Moc Chau Hotel");
		Tour tour5 = new Tour("55", "Tour Cao Bằng", 990, (short) 8, "Cao Nang", "1 ngày 1 đêm", "Cao Nang Hotel");
		Tour tour6 = new Tour("66", "Tour Mộc Châu", 2500, (short) 15, "Moc Chau", "2 ngày 2 đêm", "Moc Chau Hotel");
		Tour tour7 = new Tour("66", "Tour Sam Son", 1500, (short) 15, "Thanh Hoa", "2 ngày 2 đêm", "Muong Thanh Hotel");
		System.out.println("---------------------------- THÊM TOUR TRONG DANH SÁCH ----------------------------");
		tour_list.addTour(tour1);
		tour_list.addTour(tour2);
		tour_list.addTour(tour3);
		tour_list.addTour(tour4);
		tour_list.addTour(tour5);
		tour_list.addTour(tour6);
		tour_list.addTour(tour7); // Không được add vào danh sách vì có id trùng với tour6

		// Xuất danh sách:
		System.out.println("Danh sách ban đầu là: ");
		tour_list.printList();

		System.out.println("\n---------------------------- SỬA TOUR TRONG DANH SÁCH ----------------------------");
		Tour tour1_edit = new Tour("11", "Tour vịnh Hạ Long", 2000, (short) 15, "Ha Long", "2 ngày 1 đêm",
				"Ha Long Hotel");
		Tour tour2_edit = new Tour("10", "Tour phố Cổ Hội An", 2300, (short) 20, "Hoi An", "1 ngày 1 đêm",
				"Hoi An Hotel");
		// Sửa tour 1:
		System.out.println("Tiến hành sửa Tour 1: ");
		if (tour_list.editTour(tour1_edit)) {
			System.out.println("Sửa thành công sản phẩm có mã là " + tour1_edit.getProduct_id());
			System.out.println("Danh sách tour sau khi sửa là: ");
			tour_list.printList();
		} else {
			System.err.println("Sửa không thành công do mã không tồn tại hoặc đã bị xóa!");
		}
		// Sửa tour 2:
		System.out.println("Tiến hành sửa Tour 2: ");
		if (tour_list.editTour(tour2_edit)) {
			System.out.println("Sửa thành công sản phẩm có mã là " + tour2_edit.getProduct_id());
			System.out.println("Danh sách tour sau khi sửa là: ");
			tour_list.printList();
		} else {
			System.out.println("Sửa không thành công do mã không tồn tại hoặc đã bị xóa!");
		}

		System.out.println("\n------------------------------ XÓA TOUR TRONG DANH SÁCH ------------------------------");
		System.out.println("Nhập mã sản phẩm cần xóa: ");
		String id = new Scanner(System.in).nextLine();
		Tour tour_del = new Tour(id);
		System.out.println("Tiến hành xóa tour theo mã là " + tour_del.getProduct_id());
		if (tour_list.delTour(tour_del)) {
			System.out.println("Xóa sản phẩm thành công.");
			System.out.println("Danh sách sau khi xóa là: ");
			tour_list.printList();
		} else {
			System.out.println("Không thể xóa sản phẩm do mã không tồn tại!");
		}

		System.out.println("\n------------------------------ TÌM TOUR TRONG DANH SÁCH ------------------------------");
		System.out.println("Nhập tên tour cần tìm: ");
		String name = new Scanner(System.in).nextLine();
		List<Tour> results = tour_list.searchTour(name);
		System.out.println("Tiến hành tìm những Tour có tên là \"" + name + "\"");
		for (Tour x : results) {
			System.out.println(x);
		}

		System.out.println("\n---------------------------- SẮP XẾP TOUR TRONG DANH SÁCH ----------------------------");
		System.out.println("Sắp xếp danh sách tăng dần theo giá: ");
		tour_list.sortedTour();
		tour_list.printList();
	}
}
