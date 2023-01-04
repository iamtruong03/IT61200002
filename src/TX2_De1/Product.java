package TX2_De1;

public class Product {

	// contanst
	public static final String PRODUCT_ID = "No product_id";
	public static final String PRODUCT_NAME = "No product_name";
	public static final double PRODUCT_PRICE = 0;
	public static final double PRODUCT_TOTAL = 0;

	//
	protected String product_id;
	protected String product_name;
	protected double product_price;
	protected double product_total;

	// contructor
	public Product() {

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

	public static String getProductId() {
		return PRODUCT_ID;
	}

	public static String getProductName() {
		return PRODUCT_NAME;
	}

	public static double getProductPrice() {
		return PRODUCT_PRICE;
	}

	public static double getProductTotal() {
		return PRODUCT_TOTAL;
	}

	//
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_total=" + product_total + "]";
	}

}
