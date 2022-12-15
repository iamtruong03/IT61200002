package objects;

//public class Person {

//	
//	// class 
//
//	// Object's pr
//	private static int count=0;
//	private String firstname;
//	private String lastname;
//	private byte age;
//
//	// contructor method
//	public Person() {
//		// đặc biệt loại 1 không tham số
//		// this.firstname = "No firstname";
//		// this.lastname = "No lastname";
//		// this.age = 0;
//		this("No Firstname", "No Lastname", (byte) 0);
//
//	}
//
//	public Person(byte age) {
//		this.firstname = "No firstname";
//		this.lastname = "No lastname";
//		this.age = age;
//
//	}
//
//	public Person(String f, byte age) {
//		this.firstname = f;
//		this.lastname = "No lastname";
//		this.age = age;
//
//	}
//
//	public Person(String f, String l, byte age) {
//		// dac biet loai 2- day du tham so
//		this.firstname = f;
//		this.lastname = l;
//		this.age = age;
//		
//		// tang bien dem doi tuong
//		Person.count++;
//
//	}
//	
//
//	
//
//	// Gettor methods
//	public String getfirstname() {
//		return this.firstname;
//	}
//
//	public String getlastname() {
//		return this.lastname;
//	}
//
//	public byte getage() {
//		return this.age;
//	}
//
//	// lấy ra các đối tượng của thuộc tính
//	public String toString() {
//		return lastname + " " + firstname + " " + age;
//	}
//	
//	public static int countPerson() {
//			return Person.count;
//		}
//
//	// Settor methods
//
//	public Person setfirstname(String firstname) {
//		this.firstname = firstname;
//		return this;
//	}
//
//	public Person setlastname(String lastname) {
//		this.lastname = lastname;
//		return this;
//	}
//
//	public Person setage(byte age) {
//		this.age = age;
//		return this;
//	}
//
//	public static void main(String[] arg) {
//		// khoi tao doi tuong
//		Person p;
//		Person p1 = new Person();
////		Person p2 = new Person((byte) 18);
////		Person p3 = new Person("Truong", (byte) 18);
////		Person p4 = new Person("Truong", "Minh", (byte) 18);
//
//		System.out.println(p1);
//
//		// bo sung thong tin cho p1
////		p1.setfirstname("Truong");
////		p1.setlastname("Nong Minh");
////		p1.setage((byte) 18);
//		// k khuyen khich -> truy cap bo nho cua hdt
//
//		p1.setfirstname("Truong").setlastname("Nong Minh").setage((byte) 18);
//		System.out.println(p1);
//		System.out.println("So doi tuong khoi tao la: "+Person.countPerson());
//
//	}
//
//}

public class Person implements Comparable<Person> {
	// constanst

	public static final String FIRSTNAME = "No FirstName";
	public static final String LASTNAME = "No LastName";
	public static final byte AGE = 0;
	public static final Address ADDRESS = new Address();
	// Classes's variables

	private static int count;
	// object's properties - 0
	private String firstName;
	private String lastName;
	private byte age;
	private Address address;

// Constructor methods
	public Person() {
		// đặc biệt loại 1 - không tham số
//		this.firstName = "No firstName";
//		this.lastName = "No lastName";
//		this.age = 0;
		this(Person.FIRSTNAME, Person.LASTNAME, Person.AGE, Person.ADDRESS);
	}

	public Person(byte age) {
		this("No firstName", "No lastName", age, new Address());
	}

	public Person(String firstName, byte age) {
		this(firstName, "No lastName", age, new Address());
	}

	public Person(String firstName, String lastName, byte age, Address address) {
		// Đặc biệt loại 2 vì có đầy đủ tham số
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		// cách 1;
		// this.address = address;
		// cách 2
		this.address = new Address();
		// tăng biến đếm đối tượng
		Person.count++;
	}

	// Getter methods
	public String getfirstName() {
		return this.firstName;
	}

	public String getlastName() {
		return this.lastName;
	}

	public byte getage() {
		return this.age;
	}

	public Address getaddress() {
		return this.address;
	}

	// Setter methods
	public Person setfirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public Person setlastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public Person setage(byte age) {
		this.age = age;
		return this;
	}

	public Person setaddress(Address address) {
		this.address = address;
		return this;
	}

	// Other methods - 5
	public String toString() {
		// return lastName + " " + firstName + ", " + age + ", " +
		// this.address.toString();
		return lastName + " " + firstName + ", " + age;
	}

	public static int countPerson() {
		return Person.count;
	}

	protected void finalize() throws Throwable {
		// giảm số đối tượng trong lớp
		Person.count--;

	}

	public static void main(String[] args) {
		// khởi tạo đối tượng

		Address addr = new Address("Hà Nội", "Bac Tu Liem", "Pho Nhon");
		Person p;
		Person p1 = new Person();
		Person p2 = new Person((byte) 18);
		Person p3 = new Person("Tien", (byte) 20);
		Person p4 = new Person("Tien", "Nguyen", (byte) 23, addr);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

		// bổ xung thông tin vào p1

		p1.setfirstName("Tien").setlastName("Nguyen Anh").setage((byte) 20);

		System.out.println("so doi tuong duoc tao ra la: " + Person.countPerson());

	}

	// person o(can dc so sanh) ton tai truoc, this: dc so sanh
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age - o.getage();
	}
}
//Biến và phương thức kiểu này không thuộc về 1 dối tượng cụ thể nào -> thuộc về lớp.
