package object;

public class Person {
	
	// class 

	// Object's pr
	private static int count=0;
	private String firstname;
	private String lastname;
	private byte age;

	// contructor method
	public Person() {
		// đặc biệt loại 1 không tham số
		// this.firstname = "No firstname";
		// this.lastname = "No lastname";
		// this.age = 0;
		this("No Firstname", "No Lastname", (byte) 0);

	}

	public Person(byte age) {
		this.firstname = "No firstname";
		this.lastname = "No lastname";
		this.age = age;

	}

	public Person(String f, byte age) {
		this.firstname = f;
		this.lastname = "No lastname";
		this.age = age;

	}

	public Person(String f, String l, byte age) {
		// dac biet loai 2- day du tham so
		this.firstname = f;
		this.lastname = l;
		this.age = age;
		
		// tang bien dem doi tuong
		Person.count++;

	}
	

	

	// Gettor methods
	public String getfirstname() {
		return this.firstname;
	}

	public String getlastname() {
		return this.lastname;
	}

	public byte getage() {
		return this.age;
	}

	// lấy ra các đối tượng của thuộc tính
	public String toString() {
		return lastname + " " + firstname + " " + age;
	}
	
	public static int countPerson() {
			return Person.count;
		}

	// Settor methods

	public Person setfirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}

	public Person setlastname(String lastname) {
		this.lastname = lastname;
		return this;
	}

	public Person setage(byte age) {
		this.age = age;
		return this;
	}

	public static void main(String[] arg) {
		// khoi tao doi tuong
		Person p;
		Person p1 = new Person();
//		Person p2 = new Person((byte) 18);
//		Person p3 = new Person("Truong", (byte) 18);
//		Person p4 = new Person("Truong", "Minh", (byte) 18);

		System.out.println(p1);

		// bo sung thong tin cho p1
//		p1.setfirstname("Truong");
//		p1.setlastname("Nong Minh");
//		p1.setage((byte) 18);
		// k khuyen khich -> truy cap bo nho cua hdt

		p1.setfirstname("Truong").setlastname("Nong Minh").setage((byte) 18);
		System.out.println(p1);
		System.out.println("So doi tuong khoi tao la: "+Person.countPerson());

	}

}
