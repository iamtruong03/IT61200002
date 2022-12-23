package TX2_De2;

import java.util.ArrayList;

public class Tour extends Product {
	private String tour_attraction; // địa điểm du lịch
	private String tour_time; // độ dài chuyến du lịch
	private String tour_hotels; // khách sạn du lịch

	// contructor

	public Tour() {

	}

	public Tour(String product_id, String product_name, double product_price, double product_total,
			String tour_attraction, String tour_time, String tour_hotels) {
		super(product_id, product_name, product_price, product_total);
		this.tour_attraction = tour_attraction;
		this.tour_time = tour_time;
		this.tour_hotels = tour_hotels;
	}

	// getter and seter
	public String getTour_attraction() {
		return tour_attraction;
	}

	public void setTour_attraction(String tour_attraction) {
		this.tour_attraction = tour_attraction;
	}

	public String getTour_time() {
		return tour_time;
	}

	public void setTour_time(String tour_time) {
		this.tour_time = tour_time;
	}

	public String getTour_hotels() {
		return tour_hotels;
	}

	public void setTour_hotels(String tour_hotels) {
		this.tour_hotels = tour_hotels;
	}

	// toString
	@Override
	public String toString() {
		return "Tour [tour_attraction=" + tour_attraction + ", tour_time=" + tour_time + ", tour_hotels=" + tour_hotels
				+ "]";
	}

	// list
	ArrayList<Tour> list;

	//
//	public static void printArray(ArrayList<Tour t>);

	// Them
	public boolean addTour(Tour t) {
		System.out.println("Vui long nhap san pham: ");

		return true;
	}

	// Sua
	public boolean editTour(Tour t) {

		return true;
	}

	// Xoa
	public boolean delTour(short product_id) {

		return true;

	}
	
	// Tim kiem
	public List<Tour> searchTour(String name);

	// Sap xep theo gia
	public double compareTo(Tour o) {
		// TODO Auto-generated method stub
		return this.product_price - o.getProduct_price();
	}

}
