package objects;

public class worker extends Person {
	// constanst
	public static final int WORKER_ID = 0;
	public static final int WORKER_NET = 0;
	public static final String WORKER_FACTORY = " No ";
	public static final String WORKER_POSITION = "No ";
	public static final short WORKER_APPLY_YEAR = 0;
	
	// properties
	private int worker_id;
	private int worker_net; // Lương
	private String worker_factory; // Phân xưởng
	private String worker_position; // Vị trí
	private short worker_apply_year;

	// Constructor
	public worker() {

	}

	public worker(String firstName, String lastName, byte age, Address address, int worker_id, int worker_net,
			String worker_factory, String worker_position, short worker_apply_year) {
		super(firstName, lastName, age, address);
		this.worker_id = worker_id;
		this.worker_net = worker_net;
		this.worker_factory = worker_factory;
		this.worker_position = worker_position;
		this.worker_apply_year = worker_apply_year;
	}

	// Setter and getter
	public int getWorker_id() {
		return worker_id;
	}

	public void setWorker_id(int worker_id) {
		this.worker_id = worker_id;
	}

	public int getWorker_net() {
		return worker_net;
	}

	public void setWorker_net(int worker_net) {
		this.worker_net = worker_net;
	}

	public String getWorker_factory() {
		return worker_factory;
	}

	public void setWorker_factory(String worker_factory) {
		this.worker_factory = worker_factory;
	}

	public String getWorker_position() {
		return worker_position;
	}

	public void setWorker_position(String worker_position) {
		this.worker_position = worker_position;
	}

	public short getWorker_apply_year() {
		return worker_apply_year;
	}

	public void setWorker_apply_year(short worker_apply_year) {
		this.worker_apply_year = worker_apply_year;
	}

	// to String
	@Override
	public String toString() {
		return "worker [" + super.toString() + " worker_id=" + worker_id + ", worker_net=" + worker_net + ", worker_factory=" + worker_factory
				+ ", worker_position=" + worker_position + ", worker_apply_year=" + worker_apply_year + "]";
	}
	
	public static void main(String[] args) {
		// Khai báo đối tượng địa chỉ
		Address addr = new Address();

		// Khai báo đối tượng
		Person w = new worker("Truong", "Nong Minh", (byte)19, addr, 6868, 200, "B ","Manager ", (short)2022 );
		
		// In thong tin
		System.out.println(w.toString());
		
	}

}
