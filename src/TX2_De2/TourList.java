package TX2_De2;

import java.util.*;

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
		System.out.println("---------------------------- THEM TOUR TRONG DANH SACH ----------------------------");
		tour_list.addTour(tour1);
		tour_list.addTour(tour2);
		tour_list.addTour(tour3);
		tour_list.addTour(tour4);
		tour_list.addTour(tour5);
		tour_list.addTour(tour6);
		tour_list.addTour(tour7); // Không được add vào danh sách vì có id trùng với tour6

		// Xuất danh sách:
		System.out.println("Danh sach ban đau la: ");
		tour_list.printList();

		System.out.println("\n---------------------------- SUA TOUR TRONG DANH SACH ----------------------------");
		Tour tour1_edit = new Tour("11", "Tour vịnh Hạ Long", 2000, (short) 15, "Ha Long", "2 ngày 1 đêm",
				"Ha Long Hotel");
		Tour tour2_edit = new Tour("10", "Tour phố Cổ Hội An", 2300, (short) 20, "Hoi An", "1 ngày 1 đêm",
				"Hoi An Hotel");
		// Sửa tour 1:
		System.out.println("Tiến hành sửa Tour 1: ");
		if (tour_list.editTour(tour1_edit)) {
			System.out.println("Sua thanh cong san pham co ma la " + tour1_edit.getProduct_id());
			System.out.println("Danh sach tour sau khi sua là: ");
			tour_list.printList();
		} else {
			System.err.println("Sua khong thanh cong do ma khong ton tai hoac đa bi xoa!");
		}
		// Sửa tour 2:
		System.out.println("Tien hanh sua Tour 2: ");
		if (tour_list.editTour(tour2_edit)) {
			System.out.println("Sua thanh cong san pham co ma la " + tour2_edit.getProduct_id());
			System.out.println("Danh sach tour sau khi sua la: ");
			tour_list.printList();
		} else {
			System.out.println("Sua khong thanh cong do ma khong ton tai hoac da bi xoa!");
		}

		System.out.println("\n------------------------------ XOA TOUR TRONG DANH SACH ------------------------------");
		System.out.println("Nhap ma san pham can xoa: ");
		String id = new Scanner(System.in).nextLine();
		Tour tour_del = new Tour(id);
		System.out.println("Tien hanh xoa tour theo ma la " + tour_del.getProduct_id());
		if (tour_list.delTour(tour_del)) {
			System.out.println("Xoa san pham thanh cong.");
			System.out.println("Danh sach sau khi xoa la: ");
			tour_list.printList();
		} else {
			System.out.println("Khong the xoa san pham do ma khong ton tai!");
		}

		System.out.println("\n------------------------------ TIM TOUR TRONG DANH SACH ------------------------------");
		System.out.println("Nhap ten tour can tim: ");
		String name = new Scanner(System.in).nextLine();
		List<Tour> results = tour_list.searchTour(name);
		System.out.println("Tien hanh tim nhung Tour co ten la \"" + name + "\"");
		for (Tour x : results) {
			System.out.println(x);
		}

		System.out.println("\n---------------------------- SAP XEP TOUR TRONG DANH SACH ----------------------------");
		System.out.println("Sap xep danh sach tang dan theo gia: ");
		tour_list.sortedTour();
		tour_list.printList();
	}
}
