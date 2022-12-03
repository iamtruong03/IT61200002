//package Tests_Exercises;
//
//import Tests_Exercises.Product;
//
//public class Category extends Product {
//	// Constanst
//	public static final String FURNITURE = "No furniture ";
//	public static final String TILES = "No tiles ";
//
//	// Properties
//	private String furniture;
//	private String tiles;
//
//	// contructor
//	public Category(short product_id, String product_category, String product_name, float product_price,
//			String product_producer, String product_detail, String furniture, String tiles) {
//		super(product_id, product_category, product_name, product_price, product_producer, product_detail);
//		this.furniture = furniture;
//		this.tiles = tiles;
//	}
//
//	// getter and setter
//	public String getfurniture() {
//		return furniture;
//	}
//
//	public void setFurniture(String furniture) {
//		this.furniture = furniture;
//	}
//
//	public String gettiles() {
//		return tiles;
//	}
//
//	public void setTiles(String tiles) {
//		this.tiles = tiles;
//	}
//
//	public static String getFurniture() {
//		return FURNITURE;
//	}
//
//	public static String getTiles() {
//		return TILES;
//	}
//
//	// other methods
//	@Override
//	public String toString() {
//		return "Category [" + super.toString() + " furniture=" + furniture + ", tiles=" + tiles + "]";
//	}
//
//	 c. Xây dựng phương thức để sinh ngẫu nhiên (số lượng tùy ý) các sản phẩm theo
//	 từng danh mục
//	public static Product[] generateProduct(int n) {
//		// Khai bao danh sach trung gian
//		Product[] list = new Product[n];
//
//		// Danh sách mã sản phẩm:
//		short[] product_id = { 1, 2, 3 };
//
//		// Danh sách danh mục sản phẩm:
//		String[] product_category = { "furniture", "tiles" };
//
//		// Danh sách tên sản phẩm:
//		String[] product_name = {};
//
//		// Danh sách giá thành:
//		float[] product_price = {};
//
//		// Danh sách nhà sản xuất:
//		String[] product_producer = {};
//
//		// Danh sách mô tả chi tiết khác:
//		String[] product_detail = {};
//
//		// Sinh gia tri
//		int index;
//		for (int i = 0; i < list.length; i++) {
//			// Cap phat bo nho cho phan tu mang
//			list[i] = new Product();
//
//			// Sinh ngau mã sản phẩm:
//			index = (int) (Math.random() * product_id.length);
//			list[i].setproduct_id(product_id[index]);
//
//			// Sinh ngau danh mục sản phẩm:
//			index = (int) (Math.random() * lastName.length);
//			list[i].setlastName(lastName[index]);
//			
//			// Sinh ngau nhien tên sản phẩm:
//
//			// Sinh ngau nhien giá thành:
//			index = 18 + (int) (Math.random() * 5);
//			list[i].setage((byte) index);
//			
//			// Sinh ngau nhien nhà sản xuất:
//			// SInh ngau nhien mô tả chi tiết khác:
//		}
//
//		return list;
//
//	}
//
//	public static void main(String[] args) {
//
//		// test
//
//		// d. Sắp xếp danh sách sản phẩm theo giá, hoặc theo tên, hoặc theo nhà sản xuất
//		// Tìm kiếm một sản phẩm, cập nhật, xóa một sản phẩm
//		// e. in
//		// Danh sách sản phẩm
//		// Số lượng thống kê trong từng danh mục sản phẩm
//
//	}
//
//}


package Tests_Exercises;

import java.lang.Math;
/**
 *
 * @author NguyenVanHoan
 */
public class testCategory {
    private CATEGORY category_name;
	private static int countProduct = 0;

    enum CATEGORY {
	    // đồ nội thất
		Furniture, 
		// gạch ốp lát
		ceramic_tiles, 
		NULL
    }
        
    public testCategory() {
    	this.category_name = CATEGORY.NULL;
    	
    }
    public testCategory(CATEGORY category_name) {	
        this.category_name = category_name;

    }

    public CATEGORY getCategory_name() {
        return category_name;
    }

    public void setCategory_name(CATEGORY category_name) {
        this.category_name = category_name;
    }

    @Override
    public String toString() {
        return " Danh muc san pham: " + category_name ;
    }

    public static int printCountProduct() {
    	return countProduct;
    }
    // print count product in Category
    public static void countProduct(){
    	countProduct++;
    }
    
    public static void dotProduct() {
    	countProduct = countProduct - 1;
    }
    
               
}