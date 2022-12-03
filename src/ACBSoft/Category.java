package ACBSoft;

public class Category {
	// Constanst
	// Properties
	private CATEGORY category_name;

	enum CATEGORY {
		furniture, ceramic_tiles
	}

	// contructor
	public Category(CATEGORY category_name) {
		this.category_name = category_name;
	}
	
	// getter and setter
	public CATEGORY getCategory_name() {
		return category_name;
	}

	public void setCategory_name(CATEGORY category_name) {
		this.category_name = category_name;
	}
	
	// other methods
	@Override
	public String toString() {
		return "Category [category_name=" + category_name + "]";
	}

	

}