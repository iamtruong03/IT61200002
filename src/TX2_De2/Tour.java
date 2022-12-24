package TX2_De2;

import java.util.Scanner;

public class Tour extends Product implements Comparable<Tour> {
	Scanner sc = new Scanner(System.in);
	// constants
	public static final String TOUR_ATTRACTION = "NO TOUR ATTRACTION ";
	public static final String TOUR_TIME = "NO TOUR TIME";
	public static final String TOUR_HOTELS = "NO TOUR HOTELS";

	//
	private String tour_attraction; // địa điểm du lịch
	private String tour_time; // độ dài chuyến du lịch
	private String tour_hotels; // khách sạn du lịch

	// contructor

	public Tour() {

	}

	public Tour(String product_id) {
		super(product_id);

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
		return "Tour [" + super.toString() + ", Dia diem du lich=" + tour_attraction + ", Do dai tour=" + tour_time
				+ ", Khach san du lich=" + tour_hotels + "]";
	}

	// main
	public static void main(String[] args) {
		Tour tour1 = new Tour("CB1", "Tour Cat Ba", 1200, (short) 13, "Dao Cat Ba", "3 ngay 2 dem", "Cat Ba Hotel");
		System.out.println(tour1.toString());
	}

	//
	public int compareTo(Tour o) {
		if (this.getProduct_price() > o.getProduct_price()) {
			return 1;
		} else if (this.getProduct_price() < o.getProduct_price()) {
			return -1;
		} else {
			return 0;
		}
	}
}