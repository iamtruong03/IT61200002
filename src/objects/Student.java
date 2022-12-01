package objects;

public class Student extends Person {

	// Constanst
	public static final int STUDENT_ID = 0;
	public static final String STUDENT_MANAGE_ID = "(2022)0123456789";
	public static final String STUDENT_SPECIALY = "None";

	// Student's properties
	private int student_id;
	private String student_manage_id;
	private String student_specialed;

	// Constructor
	public Student() {
		this(Student.FIRSTNAME, Student.LASTNAME, Student.AGE, Student.ADDRESS, Student.STUDENT_ID,
				Student.STUDENT_MANAGE_ID, Student.STUDENT_SPECIALY);
	}

	public Student(String firstName, String lastName, byte age, Address address, int student_id,
			String student_manage_id, String student_specialed) {
		// Khởi tạo đối tượng cha
		super(firstName, lastName, age, address);

		// Gán giá trị cho thuộc tính đối tượng con
		this.student_id = student_id;
		this.student_manage_id = student_manage_id;
		this.student_specialed = student_specialed;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_manage_id() {
		return student_manage_id;
	}

	public void setStudent_manage_id(String student_manage_id) {
		this.student_manage_id = student_manage_id;
	}

	public String getStudent_specialed() {
		return student_specialed;
	}

	public void setStudent_specialed(String student_specialed) {
		this.student_specialed = student_specialed;
	}

	public String toString() {
		return "Student [" + super.toString() + " - student_id=" + student_id + ", student_manage_id="
				+ student_manage_id + ", student_specialed=" + student_specialed + "]";
	}

	public static void main(String[] args) {
		// Khai báo đối tượng địa chỉ
		Address addr = new Address();
		
		// Khai báo đối tượng sinh viên: lớp bên trái khai báo, bên phải là khởi tạo bộ nhớ, đề cao lớp đối tượng con, 
		Person s = new Student("Truong", "Nong Minh", (byte) 19, addr, 234_567, "(2021)6120003", "Cong nghe thong tin");

		// Khái báo đối tượng sv cách 2: k nhầm lẫn khi truyền dữ liệu 
		Student s1 = new Student();
		s1.setfirstName("Tuan");
		s1.setlastName("Tran Quoc");
		s1.setage((byte) 29);
		s1.setaddress(addr);
		
		s1.setStudent_id(234_678);
		s1.setStudent_manage_id("(2021)602340");
		s1.setStudent_specialed("He Thong Thong Tin");

		// In Thông tin
		System.out.println(s.toString());
		System.out.println(s1.toString());

	}
}