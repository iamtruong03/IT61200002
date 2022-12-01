package Tests_Exercises;

public class Product {
	// Constanst
	public static final short PRODUCT_ID = 0;
	public static final String PRODUCT_CATEGORY = " No product_category ";
	public static final String PRODUCT_NAME = " No product_name ";
	public static final float PRODUCT_PRICE = 0;
	public static final String PRODUCT_PRODUCER = " No product_prodcuer ";
	public static final String PRODUCT_DETAIL = " No product_detal ";

	// Properties
	private short product_id; // mã sản phẩm
	private String product_category; // danh mục sản phẩm
	private String product_name; // tên sản phẩm
	private float product_price;// cơ cấu tính giá thành
	private String product_producer; // nhà sản xuất
	private String product_detail; // mô tả chi tiết khác

	// Constructor
	// không tham số
	public Product() {
		this(Product.PRODUCT_ID, Product.PRODUCT_CATEGORY, Product.PRODUCT_NAME, Product.PRODUCT_PRICE,
				Product.PRODUCT_PRODUCER, Product.PRODUCT_DETAIL);
	}

	// đầy đủ tham số
	public Product(short product_id, String product_category, String product_name, float product_price,
			String product_producer, String product_detail) {

		this.product_id = product_id;
		this.product_category = product_category;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_producer = product_producer;
		this.product_detail = product_detail;
	}
	// tự đề xuất tham số theo mỗi thành viên

	
	// getters and setters
	public short getProduct_id() {
		return product_id;
	}

	public void setProduct_id(short product_id) {
		this.product_id = product_id;
	}

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public float getProduct_price() {
		return product_price;
	}

	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}

	public String getProduct_producer() {
		return product_producer;
	}

	public void setProduct_producer(String product_producer) {
		this.product_producer = product_producer;
	}

	public String getProduct_detail() {
		return product_detail;
	}

	public void setProduct_detail(String product_detail) {
		this.product_detail = product_detail;
	}

	public static short getProductId() {
		return PRODUCT_ID;
	}

	public static String getProductCategory() {
		return PRODUCT_CATEGORY;
	}

	public static String getProductName() {
		return PRODUCT_NAME;
	}

	public static float getProductPrice() {
		return PRODUCT_PRICE;
	}

	public static String getProductProducer() {
		return PRODUCT_PRODUCER;
	}

	public static String getProductDetail() {
		return PRODUCT_DETAIL;
	}
	
	// other methods
	public String toString() {
		return "Product [product_id=" + product_id + ", product_category=" + product_category + ", product_name="
				+ product_name + ", product_price=" + product_price + ", product_producer=" + product_producer
				+ ", product_detail=" + product_detail + "]";
	}
	

}
