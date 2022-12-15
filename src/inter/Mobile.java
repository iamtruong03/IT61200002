package inter;

public class Mobile implements Product {

	private short mobile_id;
	private String mobile_name;
	private String mobile_summary;
	private String mobile_detail;
	private double mobile_price;

	// contructor
	public Mobile() {
		
	}
	public Mobile(short mobile_id, String mobile_name, String mobile_summary, String mobile_detail,
			double mobile_price) {
		super();
		this.mobile_id = mobile_id;
		this.mobile_name = mobile_name;
		this.mobile_summary = mobile_summary;
		this.mobile_detail = mobile_detail;
		this.mobile_price = mobile_price;
	}

	// getter and setter
	public short getMobile_id() {
		return mobile_id;
	}

	public void setMobile_id(short mobile_id) {
		this.mobile_id = mobile_id;
	}

	public String getMobile_name() {
		return mobile_name;
	}

	public void setMobile_name(String mobile_name) {
		this.mobile_name = mobile_name;
	}

	public String getMobile_summary() {
		return mobile_summary;
	}

	public void setMobile_summary(String mobile_summary) {
		this.mobile_summary = mobile_summary;
	}

	public String getMobile_detail() {
		return mobile_detail;
	}

	public void setMobile_detail(String mobile_detail) {
		this.mobile_detail = mobile_detail;
	}

	public double getMobile_price() {
		return mobile_price;
	}

	public void setMobile_price(double mobile_price) {
		this.mobile_price = mobile_price;
	}

	// toString
	@Override
	public String toString() {
		return "Mobile [mobile_id=" + mobile_id + ", mobile_name=" + mobile_name + ", mobile_summary=" + mobile_summary
				+ ", mobile_detail=" + mobile_detail + ", mobile_price=" + mobile_price + "]";
	}

	//
	@Override
	public double getPrice(int id) {
		// TODO Auto-generated method stub
		if (this.mobile_id == id) {
			return this.mobile_price;
		} else {
			return 0;
		}
	}

	@Override
	public String getIntro(int id) {
		// TODO Auto-generated method stub
		if (this.mobile_id == id) {
			return this.mobile_name + ": " + this.mobile_summary;
		} else {
			return "---";
		}
	}

	@Override
	public String getDetail(int id) {
		// TODO Auto-generated method stub
		if (this.mobile_id == id) {
			String detail = "ID: " + this.mobile_id;
			detail += "\nNAME: " + this.mobile_name;
			detail += "\nSUMMARY: " + this.mobile_summary;
			detail += "\nDETAIL: " + this.mobile_detail;
			detail += "\nPRICE: " + this.mobile_price;

			return detail;
		} else {
			return "---";
		}
	}

}
