package TX1_version3;

import java.util.Scanner;

public abstract class Product extends Category {
	// Constants
	public static final short PRODUCT_ID = 0;
	public static final String PRODUCT_NAME = "Unknow";
	public static final float PRODUCT_PRICE = 0;
	public static final String PRODUCT_MANUFACTURER = "Unknow";
	public static final String PRODUCT_DETAIL = "No Detail";

	// Classes' variable
	public static short countID = 1;

	// Object's properties
	private short product_id; // Mã sản phẩm
	private String product_name; // tên sản phẩm
	private float product_price; // Cơ cấu giá thành
	private String product_manufacturer; // Nhà sản xuất
	private String product_detail; // Mô tả chi tiết khác

	// Constructor methods

	public Product() {

	}

//	public Product() {
//		this((short) Product.countID, Category.CATEGORY_NAME, Product.PRODUCT_NAME, (float) Product.PRODUCT_PRICE,
//				Product.PRODUCT_MANUFACTURER, Product.PRODUCT_DETAIL);
//	}

	public Product(String product_category) {
		this(Product.countID, product_category, Product.PRODUCT_NAME, (float) Product.PRODUCT_PRICE,
				Product.PRODUCT_MANUFACTURER, Product.PRODUCT_DETAIL);
	}

	public Product(short product_id, String product_category, String product_name, float product_price,
			String product_manufacturer, String product_detail) {
		super(product_category);
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_manufacturer = product_manufacturer;
		this.product_detail = product_detail;
		++Product.countID;
	}

	public Product(Product product) {
		this.product_id = product.product_id;
		this.product_name = product.product_name;
		this.product_price = product.product_price;
		this.product_manufacturer = product.product_manufacturer;
		this.product_detail = product.product_detail;
	}

	// Getter and Setter methods

	public short getProduct_id() {
		return product_id;
	}

	public void setProduct_id(short product_id) {
		this.product_id = product_id;
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

	public String getProduct_manufacturer() {
		return product_manufacturer;
	}

	public void setProduct_manufacturer(String product_manufacturer) {
		this.product_manufacturer = product_manufacturer;
	}

	public String getProduct_detail() {
		return product_detail;
	}

	public void setProduct_detail(String product_detail) {
		this.product_detail = product_detail;
	}

	// other methods
	public String toString() {
		return "Product [Ma: " + product_id + ", " + super.toString() + ", Ten san pham:" + product_name + ", Gia:"
				+ product_price + ", Nha SX: " + product_manufacturer + ", Mo ta:" + product_detail + "]";
	}

	// truu tuong
	public abstract double product_price();

	//
	public static Product[] generateProducts(int n) {
		Product[] listOfProducts = new Product[n];

		for (int i = 0; i < n; i++) {
			String product_categoryName = Category.generateCategoryName();

			if (product_categoryName == "Furniture") {
				listOfProducts[i] = Furniture.generateFurniture();
			} else {
				listOfProducts[i] = Ceramic_Tiles.generateCeramic_Tiles();
			}

		}
		return listOfProducts;
	}

	public static void main(String[] args) {

	}

}
