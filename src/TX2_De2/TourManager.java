package TX2_De2;

import java.util.List;

public interface TourManager {
	// Thêm
	public boolean addTour(Tour t);

	// Sua
	public boolean editTour(Tour t);

	// Xoa
	public boolean delTour(Tour t);

	// Tìm kiếm sản phẩm theo tên:
	public List<Tour> searchTour(String name);

	// Sắp xếp tăng dần chi phí của hành trình:
	public List<Tour> sortedTour();
}