package objects;

public class Teacher extends Person {
	// constanst
	public static final int TE_ID = 0;
	public static final int TE_NET = 0;
	public static final String TE_SUBJECT = " No subject";
	public static final short TE_APPLY_YEAR = 0;

	// properties
	private int te_id; //
	private int te_net; // Thu nhập
	private String te_subject; // Bộ môn
	private short te_apply_year; // Năm làm việc

	// Constructor
	public Teacher() {

	}

	public Teacher(String firstName, String lastName, byte age, Address address, int te_id, int te_net,
			String te_subject, short te_apply_year) {
		super(firstName, lastName, age, address);
		this.te_id = te_id;
		this.te_net = te_net;
		this.te_subject = te_subject;
		this.te_apply_year = te_apply_year;
	}

	// Setter and getter
	public int getTe_id() {
		return te_id;
	}

	public void setTe_id(int te_id) {
		this.te_id = te_id;
	}

	public int getTe_net() {
		return te_net;
	}

	public void setTe_net(int te_net) {
		this.te_net = te_net;
	}

	public String getTe_subject() {
		return te_subject;
	}

	public void setTe_subject(String te_subject) {
		this.te_subject = te_subject;
	}

	public short getTe_apply_year() {
		return te_apply_year;
	}

	public void setTe_apply_year(short te_apply_year) {
		this.te_apply_year = te_apply_year;
	}

	public static int getTeId() {
		return TE_ID;
	}

	public static int getTeNet() {
		return TE_NET;
	}

	public static String getTeSubject() {
		return TE_SUBJECT;
	}

	public static short getTeApplyYear() {
		return TE_APPLY_YEAR;
	}

	// to String
	@Override
	public String toString() {
		return "Teacher [" + super.toString() + " te_id=" + te_id + ", te_net=" + te_net + ", te_subject=" + te_subject
				+ ", te_apply_year=" + te_apply_year + "]";
	}

	public static void main(String[] args) {
		// Khai báo đối tượng địa chỉ
		Address addr = new Address();
		
		// Khai báo đối tượng
		Person t = new Teacher("Huy", "Hoang Quang", (byte)40, addr, 001, 200, " English ", (short) 2003 );
		
		// In Thông tin
		System.out.println(t.toString());

	}

}
