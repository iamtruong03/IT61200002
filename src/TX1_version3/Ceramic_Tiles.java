package TX1_version3;

public class Ceramic_Tiles extends Product {

	protected double length;
	protected double width;
	protected double tiled_area;
	protected double unit_price;

	// contructor
	public Ceramic_Tiles() {

	}

	public Ceramic_Tiles(short product_id, String product_category, String product_name, float product_price,
			String product_manufacturer, String product_detail, double length, double width, double tiled_area,
			double unit_price) {
		super(product_id, product_category, product_name, product_price, product_manufacturer, product_detail);
		this.length = length;
		this.width = width;
		this.tiled_area = tiled_area;
		this.unit_price = unit_price;
	}

	// getter and setter
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getTiled_area() {
		return tiled_area;
	}

	public void setTiled_area(double tiled_area) {
		this.tiled_area = tiled_area;
	}

	public double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}

	@Override
	public double product_price() {
		// TODO Auto-generated method stub
		return unit_price * tiled_area / (length * width);
	}

	// tostring
	@Override
	public String toString() {
		return "Ceramic_Tiles [" + super.toString() + " Chieu dai=" + length + ", Chieu rong=" + width + ", Dien tich="
				+ tiled_area + ", Don gia=" + unit_price + "]";
	}

	// sinh ngau nhien
	public static Ceramic_Tiles generateCeramic_Tiles() {

		String[] listOfNames = { "Gach gia go", "Gach tham trang tri" };

		String[] listOfManufacturers = { "Gach op lat Dong Tam", "Viglacera Thang Long" };

		String[] listOfDetail = { " Khong co mo ta", " Co mo ta " };

		Ceramic_Tiles product = new Ceramic_Tiles();

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

}
