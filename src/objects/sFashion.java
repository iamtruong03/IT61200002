package objects;

public class sFashion {
	// constanst

	public static final String FASHION_NAME = "No Fashion name";
	public static final String FASHION_SIZE = "No Fashion size";
	public static final String FASHION_COLOR = "No Fashion color";
	public static final short FASHION_PRICE = 0;
	public static final Address FASHION_PRODUCER = new Address();

	// 5 properties
	private String Fashion_Name;
	private String Fashion_Size;
	private String Fashion_Color;
	private short Fashion_price;
	private Address Fashion_producer;

	// Constructor methods
	public sFashion() {
		this(sFashion.FASHION_NAME, sFashion.FASHION_SIZE, sFashion.FASHION_COLOR, sFashion.FASHION_PRICE,
				sFashion.FASHION_PRODUCER);
	}

	public sFashion(String Fashion_Name, String Fashion_Size, String Fashion_Color, short Fashion_price,
			Address Fashion_producer) {
		this.Fashion_Name = Fashion_Name;
		this.Fashion_Size = Fashion_Size;
		this.Fashion_Color = Fashion_Color;
		this.Fashion_price = Fashion_price;
		this.Fashion_producer = new Address();

	}

	// Getter methods
	public String getFashion_Name() {
		return this.Fashion_Name;
	}

	public String getFashion_Size() {
		return this.Fashion_Size;
	}

	public String getFashion_Color() {
		return this.Fashion_Color;
	}

	public short getFashion_price() {
		return this.Fashion_price;
	}

	public Address getFashion_producer() {
		return this.Fashion_producer;
	}

	// Setter methods
	public sFashion setFashion_Name(String Fashion_Name) {
		this.Fashion_Name = Fashion_Name;
		return this;
	}

	public sFashion setFashion_Size(String Fashion_Size) {
		this.Fashion_Size = Fashion_Size;
		return this;
	}

	public sFashion setFashion_Color(String Fashion_Color) {
		this.Fashion_Color = Fashion_Color;
		return this;
	}

	public sFashion setFashion_price(short Fashion_price) {
		this.Fashion_price = Fashion_price;
		return this;
	}

	public sFashion setFashion_producer(Address Fashion_producer) {
		this.Fashion_producer = Fashion_producer;
		return this;
	}

	// Other methods
	public String toString() {
		return this.Fashion_Name + ", " + Fashion_Size + ", " + Fashion_Color + ", " + Fashion_price + ", "
				+ Fashion_producer;
	}

	public static void main(String[] args) {
		Address add = new Address("Ha Noi", "Bac Tu Liem", "Pho Nhon");
		sFashion a1 = new sFashion("Jean", "M", "Black", (short) 18, add);
		System.out.println(a1);

	}

}
