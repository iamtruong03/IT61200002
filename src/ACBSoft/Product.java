package ACBSoft;

import java.util.Scanner;

public class Product extends Category {
	// Constanst
	public static final short PRODUCT_ID = 0;
	public static final String PRODUCT_NAME = " No product_name ";
	public static final float PRODUCT_PRICE = 0;
	public static final String PRODUCT_PRODUCER = " No product_prodcuer ";
	public static final String PRODUCT_DETAIL = " No product_detal ";

	// Properties
	private short product_id; // mã sản phẩm
	private String product_name; // tên sản phẩm
	private float product_price;// cơ cấu tính giá thành
	private String product_producer; // nhà sản xuất
	private String product_detail; // mô tả chi tiết khác

	// Constructor

	public Product(CATEGORY category_name, short product_id, String product_name, float product_price,
			String product_producer, String product_detail) {
		super(category_name);
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_producer = product_producer;
		this.product_detail = product_detail;
	}

	// getters and setters
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
	@Override
	public String toString() {
		return "Product [" + super.toString() + " product_id=" + product_id + ", product_name=" + product_name
				+ ", product_price=" + product_price + ", product_producer=" + product_producer + ", product_detail="
				+ product_detail + "]";
	}

	// c. Xây dựng phương thức để sinh ngẫu nhiên (số lượng tùy ý) các sản phẩm theo
	// từng danh mục

	// random Funtiture
	public static Product[] productFuntiture(Product[] list, int n) {

		short[] product_id = { 1, 2 };

		String[] product_name = { "Dong Ho Hoa La Cay", " Bo Ban An Go Cao Su " };

		float[] product_price = { 4500000, 3200000 };

		String[] product_producer = { "Do Go Minh Quoc", "Do Go Son Dong" };

		String[] product_detail = { " Khong co mo ta", " Co mo ta " };

		for (int i = 0; i < n; i++) {
			int rdproduct_id = (int) (Math.random() * 2);
			int rdproduct_name = (int) (Math.random() * 2);
			int rdproduct_price = (int) (Math.random() * 2);
			int rdproduct_producer = (int) (Math.random() * 2);
			int rdproduct_detail = (int) (Math.random() * 2);
			// Category.countProduct();
			list[i] = new Product(Category.CATEGORY.ceramic_tiles, product_id[rdproduct_id],
					product_name[rdproduct_name], product_price[rdproduct_price], product_producer[rdproduct_producer],
					product_detail[rdproduct_detail]);
		}

		return list;

	}

	// print product list
	public static void printProduct(Product[] list) {
		for (Product x : list) {
			System.out.println(x);
		}
	}

	// random ceramic_tiles
	public static Product[] productCeramicTiles(Product[] list, int n) {

		short[] product_id = { 1, 2 };

		String[] product_name = { "Gach Lat Nen ", "Gach Gia Go" };

		float[] product_price = { 350000, 380000 };

		String[] product_producer = { "Gach Dong Tam", "Gach Royal" };

		String[] product_detail = { " Khong co mo ta", " Co mo ta " };

		for (int i = 0; i < n; i++) {
			int rdproduct_id = (int) (Math.random() * 2);
			int rdproduct_name = (int) (Math.random() * 2);
			int rdproduct_price = (int) (Math.random() * 2);
			int rdproduct_producer = (int) (Math.random() * 2);
			int rdproduct_detail = (int) (Math.random() * 2);
//			Category.countProduct();
			list[i] = new Product(Category.CATEGORY.ceramic_tiles, product_id[rdproduct_id],
					product_name[rdproduct_name], product_price[rdproduct_price], product_producer[rdproduct_producer],
					product_detail[rdproduct_detail]);
		}

		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// test chức năng
		System.out.println("So san pham can random ra la : ");
		int n = sc.nextInt();
		Product[] list = new Product[n];

		// ramdom product
		Product.productCeramicTiles(list, n);
		Product.productFuntiture(list, n);
	}

}
