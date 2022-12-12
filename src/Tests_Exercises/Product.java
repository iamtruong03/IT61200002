//package Tests_Exercises;
//
//import java.util.Scanner;
//
//public class Product extends Category {
//	// Constanst
//	public static final int PRODUCT_CODE = 0;
//	public static final String PRODUCT_NAME = " No Product_name  ";
//	public static final int PRODUCT_PRICE = 0;
//	public static final String PRODUCT_PRODUCER = "No Product_producer";
//	public static final String PRODUCT_OTHER_DESCRIPTION = "No Product_other_description";
//
//	// Properties
//	private int product_code;
//	private String product_name;
//	private int product_price;
//	private String product_producer;
//	private String product_other_description;
//
//	// contructor
//	public Product() {
//
//	}
//
//	public Product(CATEGORY category_name, int product_code, String product_name, int product_price,
//			String product_producer, String product_other_description) {
//		super(category_name);
//		this.product_code = product_code;
//		this.product_name = product_name;
//		this.product_price = product_price;
//		this.product_producer = product_producer;
//		this.product_other_description = product_other_description;
//	}
//
//	public Product(CATEGORY category_name, int product_code, String product_name) {
//		super(category_name);
//		this.product_code = product_code;
//		this.product_name = product_name;
//	}
//
//	public Product(int product_code, String product_name) {
//		this.product_code = product_code;
//		this.product_name = product_name;
//	}
//	
//	// getter and setter
//
//	public int getProduct_code() {
//		return product_code;
//	}
//
//	public void setProduct_code(int product_code) {
//		this.product_code = product_code;
//	}
//
//	public String getProduct_name() {
//		return product_name;
//	}
//
//	public void setProduct_name(String product_name) {
//		this.product_name = product_name;
//	}
//
//	public int getProduct_price() {
//		return product_price;
//	}
//
//	public void setProduct_price(int product_price) {
//		this.product_price = product_price;
//	}
//
//	public String getProduct_producer() {
//		return product_producer;
//	}
//
//	public void setProduct_producer(String product_producer) {
//		this.product_producer = product_producer;
//	}
//
//	public String getProduct_other_description() {
//		return product_other_description;
//	}
//
//	public void setProduct_other_description(String product_other_description) {
//		this.product_other_description = product_other_description;
//	}
//
//	public static int getProductCode() {
//		return PRODUCT_CODE;
//	}
//
//	public static String getProductName() {
//		return PRODUCT_NAME;
//	}
//
//	public static int getProductPrice() {
//		return PRODUCT_PRICE;
//	}
//
//	public static String getProductProducer() {
//		return PRODUCT_PRODUCER;
//	}
//
//	public static String getProductOtherDescription() {
//		return PRODUCT_OTHER_DESCRIPTION;
//	}
//
//	@Override
//	public String toString() {
//		return super.toString() + " Ma SP: " + product_code + " Ten SP: " + product_name + " Gia SP: " + product_price
//				+ " Ten NSX: " + product_producer + " Mo Ta Khác: " + product_other_description;
//	}
//
//	// random Funtiture
//	public static Product[] productFuntiture(Product[] list, int n) {
//
//		int[] productCode = { 1, 2 };
//
//		String[] productName = { "Dong Ho Hoa La Cay", " Bo Ban An Go Cao Su " };
//
//		int[] productCost = { 4500000, 3200000 };
//
//		String[] producerName = { "Do Go Minh Quoc", "Do Go Son Dong" };
//
//		String[] productDescription = { " Khong co mo ta", " Co mo ta " };
//
//		for (int i = 0; i < n; i++) {
//			int rdproductCode = (int) (Math.random() * 2);
//			int rdProductName = (int) (Math.random() * 2);
//			int rdproductCost = (int) (Math.random() * 2);
//			int rdproducerName = (int) (Math.random() * 2);
//			int rdproductDescription = (int) (Math.random() * 2);
//			Category.countProduct();
//			list[i] = new Product(Category.CATEGORY.Furniture, productCode[rdproductCode], productName[rdProductName],
//					productCost[rdproductCost], producerName[rdproducerName], productDescription[rdproductDescription]);
//		}
//		return list;
//	}
//
//	// print product list
//	public static void printProduct(Product[] list) {
//		for (Product x : list) {
//			System.out.println(x);
//		}
//	}
//
//	// random CeramicTiles
//	public static Product[] productCeramicTiles(Product[] list, int n) {
//		int[] productCode = { 3, 4 };
//
//		String[] productName = { "Dong Ho Hoa La Cay", " Bo Ban An Go Cao Su " };
//
//		int[] productCost = { 4500000, 3200000 };
//
//		String[] producerName = { "Do Go Minh Quoc", "Do Go Son Dong" };
//
//		String[] productDescription = { " Khong co mo ta", " Co mo ta " };
//
//		for (int i = 0; i < n; i++) {
//			int rdproductCode = (int) (Math.random() * 2);
//			int rdProductName = (int) (Math.random() * 2);
//			int rdproductCost = (int) (Math.random() * 2);
//			int rdproducerName = (int) (Math.random() * 2);
//			int rdproductDescription = (int) (Math.random() * 2);
//			Category.countProduct();
//			list[i] = new Product(Category.CATEGORY.ceramic_tiles, productCode[rdproductCode],
//					productName[rdProductName], productCost[rdproductCost], producerName[rdproducerName],
//					productDescription[rdproductDescription]);
//		}
//		return list;
//	}
//
//	// sort ASC by cost
//	public static Product[] sortProduct(Product[] list, int n) {
//
//		for (int i = 0; i < n - 1; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (list[i].productCost() > list[j].productCost()) {
//					Product tmp = new Product();
//					tmp = list[j];
//					list[j] = list[i];
//					list[i] = tmp;
//				}
//			}
//		}
//
//		return list;
//	}
//
//	// find product
//	public static void findProduct(Product[] list, int product_code) {
//		int cnt = 0;
//		for (Product x : list) {
//			if (x.getProductCode() == product_code) {
//				x.toString();
//				cnt = 1;
//			}
//		}
//		if (cnt == 0) {
//			System.out.println("Khong tim thay san pham can tim !!");
//		}
//
//	}
//
//	// update product
//	public static Product[] updateProduct(Product[] list, int n) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("nhap ma san pham can update: ");
//		int productCode = sc.nextInt();
//		int cnt = 0;
//		for (Product x : list) {
//			if (x.getProductCode() == productCode) {
//				cnt = 1;
//			}
//		}
//		if (cnt == 0) {
//			System.out.println("Khong tim thay san pham can update !!");
//		}
//		System.out.print("ma san pham can update thanh :  ");
//		int product_code = sc.nextInt();
//		System.out.print("nhap ten san pham can update: ");
//		String product_name = sc.next();
//		System.out.print("nhap gia can update cua san pham: ");
//		int product_price = sc.nextInt();
//		System.out.print("nhap nha san xuat moi cua san pham: ");
//		String product_producer = sc.next();
//		for (int i = 0; i < n; i++) {
//			if (productCode == list[i].getProductCode()) {
//				list[i].setProduct(product_code, product_name, product_price, product_producer);
//			}
//		}
//		return list;
//	}
//
//	// erase product
//	public static Product[] eraseProduct(Product[] list, int product_code, int n) {
//		for (int i = 0; i < n; i++) {
//			if (product_code == list[i].product_code()) {
//				for (int j = i; j < n - 1; j++) {
//					list[j] = list[j + 1];
//				}
//				Category.dotProduct();
//				i--;
//				n--;
//			}
//		}
//		return list;
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		// test chức năng
//		System.out.print("So san pham can random ra la : ");
//		int n = sc.nextInt();
//		Product[] list = new Product[n];
//		// ramdom product
//		Product.productCeramicTiles(list, n);
//		// sort product
//		list = Product.sortProduct(list, n);
//		Product.printProduct(list);
//		// update product
//		list = Product.updateProduct(list, n);
//		Product.printProduct(list);
//		// erase product
//		System.out.print("Ma san pham can xoa la : ");
//		int tmp = sc.nextInt();
//		list = Product.eraseProduct(list, tmp, n);
//		Product.printProduct(list);
//		System.out.print("So luong san pham con lai: " + Category.printCountProduct());
//
//	}
//
//}
