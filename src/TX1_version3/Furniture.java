package TX1_version3;

public class Furniture extends Product {

	protected double length;
	protected double height;
	protected double unit_price;

	// contructor
	public Furniture() {

	}

	public Furniture(double length, double unit_price, double height) {
		super();
		this.length = length;
		this.unit_price = unit_price;
		this.height = height;
	}

	// getter and setter
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}

	//
	@Override
	public double product_price() {
		// TODO Auto-generated method stub
		return length * unit_price * height;
	}

	// to String
	@Override
	public String toString() {
		return "Furniture [ " + super.toString() + " Chieu dai=" + length + ", Chieu cao=" + height + ",Don gia="
				+ unit_price + " ]";
	}

	// sinh ngau nhien
	public static Furniture generateFurniture() {

		String[] listOfNames = { "Dong Ho Hoa La Cay", " Bo Ban An Go Cao Su " };

		String[] listOfManufacturers = { "Do Go Minh Quoc", "Do Go Son Dong" };

		String[] listOfDetail = { " Khong co mo ta", " Co mo ta " };

		Furniture product = new Furniture();

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

}
