package OnThi_De8;

public class DienMay extends QLySP {
	private double insurance; // bao hành ( tháng > 0 )
	private double wattage; // công suất > 0

	// contructor
	public DienMay() {

	}

	public DienMay(String id, String name, double amount, double price, double insurance, double wattage) {
		super(id, name, amount, price);
		this.insurance = insurance;
		this.wattage = wattage;
	}

	// getter and setter
	public double getInsurance() {
		return insurance;
	}

	public void setInsurance(double insurance) {
		this.insurance = insurance;
	}

	public double getWattage() {
		return wattage;
	}

	public void setWattage(double wattage) {
		this.wattage = wattage;
	}

	// to String
	@Override
	public String toString() {
		return "DienMay [insurance=" + insurance + ", wattage=" + wattage + "]";
	}

	//3 Nhap
	public static void Nhap(String id, String name, double amount, double price, double insurance, double wattage) {

	}
	
	//4
	
	//5 sap xep va in giam dan tgian bao hanh

	//
	public static void main(String[] args) {
		//Nhap(id, name, amount, price, insurance, wattage);
	}

}
