package Tests_Exercises;

public class Category {
	// Constanst
	public static final String FURNITURE = "No furniture ";
	public static final String TILES = "No tiles ";

	// Properties
	private String furniture;
	private String tiles;

	// contructor
	// ko tham số
	public Category() {
		this(Category.FURNITURE, Category.TILES);
	}

	// đầy đủ tham số
	public Category(String furniture, String tiles) {
		this.furniture = furniture;
		this.tiles = tiles;
	}

	// tự đề xuất tham số theo mỗi thành viên

	// getter and setter
	public String getFurniture() {
		return furniture;
	}

	public void setFurniture(String furniture) {
		this.furniture = furniture;
	}

	public String getTiles() {
		return tiles;
	}

	public void setTiles(String tiles) {
		this.tiles = tiles;
	}

	public static String getfurniture() {
		return FURNITURE;
	}

	public static String gettiles() {
		return TILES;
	}
	
	// other methods
	public String toString() {
		return "Category [furniture=" + furniture + ", tiles=" + tiles + "]";
	}
	
}
