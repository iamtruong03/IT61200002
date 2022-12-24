package TX2_De2;

public class Product {
	// Constants:
	public static final String PRODUCT_ID = "No PRODUCT ID";
	public static final String PRODUCT_NAME = "NO PRODUCT NAME";
	public static final double PRODUCT_PRICE = 0;
	public static final double PRODUCT_TOTAL = 0;

	private String product_id;// định danh sản phẩm
	private String product_name; // tên sảm phẩm
	protected double product_price; // giá sản phẩm
	private double product_total; // số lượng

	// contructor
	public Product() {

	}
	
	public Product(String product_id) {
		this.product_id = product_id;
	}

	public Product(String product_id, String product_name, double product_price, double product_total) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_total = product_total;
	}

	// getter and setter
	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public double getProduct_total() {
		return product_total;
	}

	public void setProduct_total(double product_total) {
		this.product_total = product_total;
	}

	// toString
	@Override
	public String toString() {
		return "Product [Dinh danh san pham=" + product_id + ", Ten san pham=" + product_name + ", Gia san pham="
				+ product_price + ", So luong=" + product_total + "]";
	}

	// Main:
	public static void main(String[] args) {
		Product sp1 = new Product("CB1", "Tour Cat Ba", 1200, (short) 13);
		System.out.println(sp1.toString());
	}

}
