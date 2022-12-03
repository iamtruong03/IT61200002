package Tests_Exercises;
//

//public class Product {
//	// Constanst
//	public static final short PRODUCT_ID = 0;
//	public static final String PRODUCT_CATEGORY = " No product_category ";
//	public static final String PRODUCT_NAME = " No product_name ";
//	public static final float PRODUCT_PRICE = 0;
//	public static final String PRODUCT_PRODUCER = " No product_prodcuer ";
//	public static final String PRODUCT_DETAIL = " No product_detal ";
//
//	// Properties
//	private short product_id; // mã sản phẩm
//	private String product_category; // danh mục sản phẩm
//	private String product_name; // tên sản phẩm
//	private float product_price;// cơ cấu tính giá thành
//	private String product_producer; // nhà sản xuất
//	private String product_detail; // mô tả chi tiết khác
//
//	// Constructor
//	// không tham số
//	public Product() {
//		this(Product.PRODUCT_ID, Product.PRODUCT_CATEGORY, Product.PRODUCT_NAME, Product.PRODUCT_PRICE,
//				Product.PRODUCT_PRODUCER, Product.PRODUCT_DETAIL);
//	}
//
//	// đầy đủ tham số
//	public Product(short product_id, String product_category, String product_name, float product_price,
//			String product_producer, String product_detail) {
//
//		this.product_id = product_id;
//		this.product_category = product_category;
//		this.product_name = product_name;
//		this.product_price = product_price;
//		this.product_producer = product_producer;
//		this.product_detail = product_detail;
//	}
//	// tự đề xuất tham số theo mỗi thành viên
//
//	// getters and setters
//	public short getProduct_id() {
//		return product_id;
//	}
//
//	public void setProduct_id(short product_id) {
//		this.product_id = product_id;
//	}
//
//	public String getProduct_category() {
//		return product_category;
//	}
//
//	public void setProduct_category(String product_category) {
//		this.product_category = product_category;
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
//	public float getProduct_price() {
//		return product_price;
//	}
//
//	public void setProduct_price(float product_price) {
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
//	public String getProduct_detail() {
//		return product_detail;
//	}
//
//	public void setProduct_detail(String product_detail) {
//		this.product_detail = product_detail;
//	}
//
//	public static short getProductId() {
//		return PRODUCT_ID;
//	}
//
//	public static String getProductCategory() {
//		return PRODUCT_CATEGORY;
//	}
//
//	public static String getProductName() {
//		return PRODUCT_NAME;
//	}
//
//	public static float getProductPrice() {
//		return PRODUCT_PRICE;
//	}
//
//	public static String getProductProducer() {
//		return PRODUCT_PRODUCER;
//	}
//
//	public static String getProductDetail() {
//		return PRODUCT_DETAIL;
//	}
//
//	// other methods
//	public String toString() {
//		return "Product [product_id=" + product_id + ", product_category=" + product_category + ", product_name="
//				+ product_name + ", product_price=" + product_price + ", product_producer=" + product_producer
//				+ ", product_detail=" + product_detail + "]";
//	}
//
//}

import java.util.Scanner;

import ACBSoft.Product;

public class testProduct extends testCategory {
	/**
	 *
	 * @author NguyenVanHoan
	 * 
	 */
	private int product_code;
	private String product_name;
	private int product_price;
	private String product_producer;
	private String product_other_description;

	public testProduct() {

	}

	public testProduct(CATEGORY category_name, int product_code, String product_name, int product_price,
			String product_producer, String product_other_description) {
		super(category_name);
		this.product_code = product_code;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_producer = product_producer;
		this.product_other_description = product_other_description;
	}

	public testProduct(CATEGORY category_name, int product_code, String product_name) {
		super(category_name);
		this.product_code = product_code;
		this.product_name = product_name;
	}

	public testProduct(int product_code, String product_name) {
		this.product_code = product_code;
		this.product_name = product_name;
	}

	public int productCost() {
		return product_price;
	}

	public String productName() {
		return product_name;
	}

	public String productProducer() {
		return product_producer;
	}

	public int productCode() {
		return product_code;
	}

	public void setProduct(int product_code, String product_name, int product_price, String product_producer) {
		this.product_code = product_code;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_producer = product_producer;

	}

	@Override
	public String toString() {
		return super.toString() + " Ma SP: " + product_code + " Ten SP: " + product_name + " Gia SP: " + product_price
				+ " Ten NSX: " + product_producer + " Mo Ta Khac: " + product_other_description;
	}

	// random Funtiture
	public static testProduct[] productFuntiture(testProduct[] list, int n) {

		int[] productCode = { 1, 2, 3, 4, 5, 6 };

		String[] productName = { "Ghe", "Ban Lam Viec", "Gia Sach", "Tu Quan Ao", "Ban An", "Giuong Ngu" };

		int[] productCost = { 200, 300, 400, 500, 600, 750, 860 };

		String[] producerName = { "Noi That Homezy", "Noi That BTN", "Noi That Cao Cấp Emporio",
				"Noi That Thang Phuong", "Nội Thất Kobe Việt", "Đồ Gỗ Thanh Hà", "Đồ Gỗ Nội Thất Song Thắng",
				"Đồ Gỗ Phú Long Tân" };

		String[] productDescription = { "Co mo ta", "Khong co mo ta" };
		for (int i = 0; i < n; i++) {
			int rdproductCode = (int) (Math.random() * 6);
			int rdProductName = (int) (Math.random() * 6);
			int rdproductCost = (int) (Math.random() * 7);
			int rdproducerName = (int) (Math.random() * 8);
			int rdproductDescription = (int) (Math.random() * 2);
			testCategory.countProduct();
			list[i] = new testProduct(testCategory.CATEGORY.Furniture, productCode[rdproductCode],
					productName[rdProductName], productCost[rdproductCost], producerName[rdproducerName],
					productDescription[rdproductDescription]);
		}
		return list;
	}

	// print product list
	public static void printProduct(testProduct[] list) {
		for (testProduct x : list) {
			System.out.println(x);
		}
	}

	// random CeramicTiles
	public static testProduct[] productceramicTiles(testProduct[] list, int n) {
		int[] productCode = { 7, 8, 9, 10, 11, 12 };

		String[] productName = { "Gach Taicera", "Gach TKG", "Gach Keraben", "Gach Tay Ban Nha", "Gach Viglacera",
				"Gach Chang Yih" };

		int[] productCost = { 20, 30, 40, 50, 60, 75, 86 };

		String[] producerName = { "Cong ty gach op lat Dong Tam", "Viglacera Thang Long", "Op lat CMC", "Prime Group",
				"Royal Group", "Op lat Thach Ban", "KY THUONG THIEN HOANG.", "Op lat Bach Ma" };

		String[] productDescription = { "Co mo ta", "Khong co mo ta" };
		for (int i = 0; i < n; i++) {
			int rdproductCode = (int) (Math.random() * 6);
			int rdProductName = (int) (Math.random() * 6);
			int rdproductCost = (int) (Math.random() * 7);
			int rdproducerName = (int) (Math.random() * 8);
			int rdproductDescription = (int) (Math.random() * 2);
			testCategory.countProduct();
			list[i] = new testProduct(testCategory.CATEGORY.ceramic_tiles, productCode[rdproductCode],
					productName[rdProductName], productCost[rdproductCost], producerName[rdproducerName],
					productDescription[rdproductDescription]);
		}
		return list;
	}

	// sort ASC by cost
	public static testProduct[] sortProduct(testProduct[] list, int n) {

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (list[i].productCost() > list[j].productCost()) {
					testProduct tmp = new testProduct();
					tmp = list[j];
					list[j] = list[i];
					list[i] = tmp;
				}
			}
		}

		return list;
	}

	// find product
	public static void findProduct(testProduct[] list, int product_code) {
		int cnt = 0;
		for (testProduct x : list) {
			if (x.productCode() == product_code) {
				x.toString();
				cnt = 1;
			}
		}
		if (cnt == 0) {
			System.out.println("Khong tim thay san pham can tim !!");
		}

	}

	// update product
    public static testProduct[] updateProduct(testProduct[] list , int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma san pham can update: ");
        int productCode = sc.nextInt();
        int cnt = 0;
        for(testProduct x : list){
            if(x.productCode() == productCode){
                cnt = 1;
            }
        }
        if(cnt == 0) {
        	System.out.println("Khong tim thay san pham can update !!");
        }
        System.out.println("ma san pham can update thanh :  ");
        int product_code = sc.nextInt();
        System.out.println("nhap ten san pham can update: ");
        String product_name = sc.next();
        System.out.println("nhap gia can update caa san pham: ");
        int product_price = sc.nextInt();
        System.out.println("nhap nha san xuat moi cua san pham: ");
        String product_producer = sc.next();
        for(int i = 0; i < n; i++){
            if(productCode == list[i].productCode()){
                list[i].setProduct(product_code,product_name,product_price,product_producer);
            }
        }
        return list;
    }

//    //erase product
    public static testProduct[] eraseProduct(testProduct[] list, int product_code, int n){  
	    	for(int i = 0; i < n; i++){
		            if(product_code == list[i].productCode()){
		                for(int j = i; j < n-1; j++) {
		                	list[j] = list[j+1];
		                }
		                testCategory.dotProduct();
		                i--;
		                n--;
		            }
		        }
        return list;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// test chức năng
		System.out.println("So san pham can random ra la : ");
		int n = sc.nextInt();
		testProduct[] list = new testProduct[n];

		// ramdom product
		testProduct.productceramicTiles(list, n);
		testProduct.productFuntiture(list, n);

        //sort product
        list = testProduct.sortProduct(list,n);
        testProduct.printProduct(list);
        //update product
        list = testProduct.updateProduct(list,n);
        testProduct.printProduct(list);
        //erase product
        System.out.println("Ma san pham can xoa la : ");
        int tmp = sc.nextInt();
        list = testProduct.eraseProduct(list,tmp,n);
        testProduct.printProduct(list);
        System.out.print("So luong san pham con lai: " + testCategory.printCountProduct());

	}

}