package objects;

/*
 * Đa hình( hình thái, sắc thái của đối tương) : cùng 1 lời gọi dc 2 kqua khác nhau phụ thuộc vào môi trường khởi tạo bộ nhớ khác nhau
 * Đa hình- ý nghĩa:
 * - 
 * Trừu tượng: 
 * -
 * 
 * BT: đa hình của teacher và worker- gvien giỏi, công nhân giỏi-> tạo good teacher, good worker 
 * thay to String bằng get infor: lấy tt cuả đối tượng
 * 
 */
public class testPerson {

	public static void main(String[] args) {

		// Khai báo đối tượng địa chỉ
		Address addr = new Address();

		// Khai báo đối tượng sv
		Person s = new Student("Truong", "Nong Minh", (byte) 19, addr, 234_567, "(2021)6120003", "Cong nghe thong tin");
		Person e = new Employee("Truong", "Nong Minh", (byte) 19, addr, 20000, "Worker", (short) 2021);

		System.out.println(s.toString());
		System.out.println(e.toString());

	}

}
