package OnThi_De8;

public class QLySP {
	private String id; // Mã hàng
	private String name; // tên hàng
	private double amount; // SL tồn
	private double price; // Đơn giá

	// contructor
	public QLySP() {

	}

	public QLySP(String id, String name, double amount, double price) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.price = price;
	}

	// getter and setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//
	@Override
	public String toString() {
		return "QLySP [id=" + id + ", name=" + name + ", amount=" + amount + ", price=" + price + "]";
	}
	
	

}
