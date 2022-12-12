package objects;

/*
 * 
 */

public abstract class Manager {
	// Gọi là phương thưc trừu tượng
	// Chắc chắn có trong lớp con
	public abstract String getInfo(Person p);

	// Gọi là phương thức tường minh: phương thức hằng
	// k thể có trong lớp con
	public String getProfiles(Person p) {
		return p.toString();
	}

	// Có thể có trog lớp con
	public String getDetail(Person p) {
		return this.getInfo(p);
	}

}
