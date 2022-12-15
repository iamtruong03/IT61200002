package Tests_Exercises;

import java.lang.Math;

public class Category {
	private CATEGORY category_name;
	private static int countProduct = 0;

	enum CATEGORY {

		Furniture, ceramic_tiles, NULL
	}

	public Category() {
		this.category_name = CATEGORY.NULL;

	}

	public Category(CATEGORY category_name) {
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
		return " Danh muc san pham: " + category_name;
	}

	public static int printCountProduct() {
		return countProduct;
	}

	// print count product in Category
	public static void countProduct() {
		countProduct++;
	}

	public static void dotProduct() {
		countProduct = countProduct - 1;
	}

}
