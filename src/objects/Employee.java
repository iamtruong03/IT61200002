package objects;

public class Employee extends Person {
	// Contanst
	public static final int EM_NET = 0;
	public static final String EM_POSITION = " NO ";
	public static final short EM_ALLPY_YEAR = 0;

	// properties
	private int em_net; // Thu nhập
	private String em_position; // Vị trí
	private short em_apply_year; // Năm làm việc

	// Constructor
	public Employee() {

	}

	public Employee(String firstName, String lastName, byte age, Address address, int em_net, String em_position,
			short em_apply_year) {

		super(firstName, lastName, age, address);

		this.em_net = em_net;
		this.em_position = em_position;
		this.em_apply_year = em_apply_year;
	}

	// getter and setter
	public int getEm_net() {
		return em_net;
	}

	public void setEm_net(int em_net) {
		this.em_net = em_net;
	}

	public String getEm_position() {
		return em_position;
	}

	public void setEm_position(String em_position) {
		this.em_position = em_position;
	}

	public short getEm_apply_year() {
		return em_apply_year;
	}

	public void setEm_apply_year(short em_apply_year) {
		this.em_apply_year = em_apply_year;
	}

	public static int getEmNet() {
		return EM_NET;
	}

	public static String getEmPosition() {
		return EM_POSITION;
	}

	public static short getEmAllpyYear() {
		return EM_ALLPY_YEAR;
	}

	//
	@Override
	public String toString() {
		return "Employee [" + super.toString() + "  em_net=" + em_net + ", em_position=" + em_position
				+ ", em_apply_year=" + em_apply_year + "]";
	}

	//
	public static void main(String[] args) {
		// Khai báo đối tượng địa chỉ
		Address addr = new Address();

		// Khai báo đối tượng
		Person e = new Employee("Truong", "Nong Minh", (byte) 19, addr, 20000, "Worker", (short) 2021);

		// In Thông tin
		System.out.println(e.toString());

	}

}
