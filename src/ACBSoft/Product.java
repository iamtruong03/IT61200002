package ACBSoft;

import java.util.Scanner;

public class Product extends Category {
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
		this((short) Product.countID, Category.CATEGORY_NAME, Product.PRODUCT_NAME, (float) Product.PRODUCT_PRICE,
				Product.PRODUCT_MANUFACTURER, Product.PRODUCT_DETAIL);
	}

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

	// Other methods
	@Override
	public String toString() {
		return "Product [Ma: " + product_id + ", " + super.toString() + ", Ten san pham:" + product_name + ", Gia:"
				+ product_price + ", Nha SX: " + product_manufacturer + ", Mo ta:" + product_detail + "]";
	}

	public static Product generateWoodenProducts() {

		String[] listOfNames = { "Dong Ho Hoa La Cay", " Bo Ban An Go Cao Su " };

		String[] listOfManufacturers = { "Do Go Minh Quoc", "Do Go Son Dong" };

		String[] listOfDetail = { " Khong co mo ta", " Co mo ta " };

		Product product = new Product();

		product.setProduct_id((short) (Math.random() * 999));

		product.setCategory_name("Funtiture");

		int index;

		index = (int) (Math.random() * listOfNames.length);
		product.setProduct_name(listOfNames[index]);

		product.setProduct_price((float) (Math.random() * 999 + 1000));

		index = (int) (Math.random() * listOfManufacturers.length);
		product.setProduct_manufacturer(listOfManufacturers[index]);

		index = (int) (Math.random() * listOfDetail.length);
		product.setProduct_detail(listOfDetail[index]);

		return product;
	}

	public static Product generateTilesProducts() {

		String[] listOfNames = { "Gach gia go", "Gach tham trang tri" };

		String[] listOfManufacturers = { "Gach op lat Dong Tam", "Viglacera Thang Long" };

		String[] listOfDetail = { " Khong co mo ta", " Co mo ta " };

		Product product = new Product();

		product.setProduct_id((short) (Math.random() * 999));

		product.setCategory_name("Ceramic Tiles");

		int index;

		index = (int) (Math.random() * listOfNames.length);
		product.setProduct_name(listOfNames[index]);

		product.setProduct_price((float) (Math.random() * 999 + 1000));

		index = (int) (Math.random() * listOfManufacturers.length);
		product.setProduct_manufacturer(listOfManufacturers[index]);

		index = (int) (Math.random() * listOfDetail.length);
		product.setProduct_detail(listOfDetail[index]);

		return product;
	}

	public static Product[] generateProducts(int n) {
		Product[] listOfProducts = new Product[n];

		for (int i = 0; i < n; i++) {
			String product_categoryName = Category.generateCategoryName();

			if (product_categoryName == "Furniture") {
				listOfProducts[i] = Product.generateWoodenProducts();
			} else {
				listOfProducts[i] = Product.generateTilesProducts();
			}

		}
		return listOfProducts;
	}

	public static void sortByPrice(Product[] product) {
		for (int i = 0; i < product.length - 1; i++) {
			int m = i;
			for (int j = i + 1; j < product.length; j++) {
				if (product[m].getProduct_price() < product[j].getProduct_price())
					m = j;
			}
			if (m != i) {
				Product temp = product[i];
				product[i] = product[m];
				product[m] = temp;
			}
		}
	}

	public static void updateProduct(Product[] product) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma san pham can cap nhap: ");
		int product_id = sc.nextInt();
		for (int i = 0; i < product.length; i++) {
			if (product[i].getProduct_id() == product_id) {
				sc.nextLine();
				System.out.print("Nhap ten danh mục: ");
				product[i].setCategory_name(sc.nextLine());

				System.out.print("Nhap ten san pham: ");
				product[i].setProduct_name(sc.nextLine());

				System.out.print("Nhap ten gia: ");
				product[i].setProduct_price(sc.nextFloat());

				sc.nextLine();
				System.out.print("Nhap ten nha san xuat: ");
				product[i].setProduct_manufacturer(sc.nextLine());

				System.out.print("Nhap mo ta chi tiet: ");
				product[i].setProduct_detail(sc.nextLine());
			}
		}
	}

	public static void searchProduct(Product[] product) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten san pham can tim kiem: ");
		String productName = sc.nextLine();

		System.out.printf("%-15s %-20s %-30s %-15s %-30s %-40s\n", "Ma san pham", "Danh muc", "Ten san pham", "Gia",
				"Nha san xuat", "Mo ta chi tiet");
		for (int i = 0; i < product.length; i++) {
			if (product[i].getProduct_name().compareTo(productName) == 0) {
				System.out.println(product[i].toString());
			}
		}
	}

	public static Product[] deleteProduct(Product[] product) {

		Product[] tempProduct = new Product[product.length - 1];

		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma san pham can xoa: ");
		int product_id = sc.nextInt();

		int newSize = 0;

		for (int i = 0; i < product.length; i++) {

			if (product[i].getProduct_id() == product_id) {
				continue;
			}

			tempProduct[newSize] = new Product();

			tempProduct[newSize] = product[i];
			++newSize;
		}
		return tempProduct;
	}

	public static void printProduct(Product[] product) {

		for (int i = 0; i < product.length; i++) {
			System.out.println(product[i].toString());
		}
	}

	public static void thongKe(Product[] product) {
		int countDoGoNoiThat = 0;
		int countGachOpLat = 0;
		for (int i = 0; i < product.length; i++) {
			if (product[i].getCategory_name().compareTo("Ceramic Tiles") == 0)
				++countDoGoNoiThat;
			else
				++countGachOpLat;
		}
		System.out.println("Danh muc đo go noi that có: " + countDoGoNoiThat + " san pham.");
		System.out.println("Danh muc gach op lat co: " + countDoGoNoiThat + " san pham.");
	}

	// MENU
	public static void menu(Product[] product) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int option = 0;
			System.out.println("----------MENU-----------");
			System.out.println("(1) - Sap xep san pham theo gia");
			System.out.println("(2) - Tim kiem mot san pham");
			System.out.println("(3) - Cap nhat mot san pham");
			System.out.println("(4) - Xoa mot san pham");
			System.out.println("(5) - In danh sach san pham");
			System.out.println("(6) - So luong thong ke trong tung danh muc san pham");
			System.out.println("(7) - Thoat chuong trinh.");
			System.out.print("Nhap lua chon cua ban: ");
			option = sc.nextInt();

			switch (option) {
			case 1:
				Product.sortByPrice(product);
				break;
			case 2:
				Product.searchProduct(product);
				break;
			case 3:
				Product.updateProduct(product);
				break;
			case 4:
				Product.deleteProduct(product);
				break;
			case 5:
				Product.printProduct(product);
				break;
			case 6:
				Product.thongKe(product);
				break;
			case 7:
				return;
			default:
				System.out.println("Lua chon khong hop le. Vui long nhap lai!");
			}
		}
	}

	public static void main(String[] args) {
		// Sinh ngau nhien so luong san pham
		int n = (int) ((Math.random() * 1000) % 20 + 8);

		// Sinh ngau nhien n san pham theo tung danh muc
		Product[] sanPham = Product.generateProducts(n);

		Product.menu(sanPham);
	}
}
