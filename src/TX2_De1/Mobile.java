package TX2_De1;

public class Mobile extends Product {

	// contanst
	public static final String MOBILE_BRAND = "No mobile brand";
	public static final String MOBILE_COLOUR = "No mobile colour";

	// 
	protected String mobile_brand;
	protected String mobile_colour;

	// contructor
	public Mobile() {

	}

	public Mobile(String product_id, String product_name, double product_price, double product_total,
			String mobile_brand, String mobile_colour) {
		super(product_id, product_name, product_price, product_total);
		this.mobile_brand = mobile_brand;
		this.mobile_colour = mobile_colour;
	}

	// getter and setter
	public String getMobile_brand() {
		return mobile_brand;
	}

	public void setMobile_brand(String mobile_brand) {
		this.mobile_brand = mobile_brand;
	}

	public String getMobile_colour() {
		return mobile_colour;
	}

	public void setMobile_colour(String mobile_colour) {
		this.mobile_colour = mobile_colour;
	}

	public static String getMobileBrand() {
		return MOBILE_BRAND;
	}

	public static String getMobileColour() {
		return MOBILE_COLOUR;
	}

	// toString
	@Override
	public String toString() {
		return "Mobile [" + super.toString() + ",mobile_brand=" + mobile_brand + ", mobile_colour=" + mobile_colour + "]";
	}

	
}
