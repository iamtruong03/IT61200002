package TX1_version3;

public class Category {
	// Constanst
	public static final String CATEGORY_NAME = "Unknow";
	// Object's properties
	protected String category_name;

	// Constructor methods
	public Category() {
		this.category_name = Category.CATEGORY_NAME;
	}

	public Category(String category_name) {
		this.category_name = category_name;
	}

	public Category(Category category) {
		this.category_name = category.category_name;
	}

	// Getter and setter
	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public static String getCategoryName() {
		return CATEGORY_NAME;
	}

	// Other methods
	@Override
	public String toString() {
		return "Ten danh muc: " + category_name;
	}

	// phương thức sinh ngẫu nhiên cho loại danh mục sản phẩm
	public static String generateCategoryName() {

		String[] listCategoryName = { "Furniture", "Ceramic Tiles" };

		int index;
		index = (int) (Math.random() * listCategoryName.length);

		return listCategoryName[index];
	}
}
