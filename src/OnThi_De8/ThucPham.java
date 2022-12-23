package OnThi_De8;

public class ThucPham extends QLySP {
	private String date_of_manufacture; // ngay sx
	private String expiration_date; // ngay het han
	private String supplier; // nha cung cap

	// contructor
	public ThucPham() {

	}

	public ThucPham(String id, String name, double amount, double price, String date_of_manufacture,
			String expiration_date, String supplier) {
		super(id, name, amount, price);
		this.date_of_manufacture = date_of_manufacture;
		this.expiration_date = expiration_date;
		this.supplier = supplier;
	}

	// getter and setter
	public String getDate_of_manufacture() {
		return date_of_manufacture;
	}

	public void setDate_of_manufacture(String date_of_manufacture) {
		this.date_of_manufacture = date_of_manufacture;
	}

	public String getExpiration_date() {
		return expiration_date;
	}

	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	@Override
	public String toString() {
		return "ThucPham [ngay sx: " + date_of_manufacture + ", ngay het han: " + expiration_date
				+ ", nha cung cap: " + supplier + "]";
	}

	// to String
	

}
