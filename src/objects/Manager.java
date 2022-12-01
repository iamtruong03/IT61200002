package objects;

/*
 * 
 */

public abstract class Manager {
	// Gọi là phương thưc trừu tượng
	public abstract String getInfo(Person p);

	
	// Gọi là phương thức tường minh
	public String getProfiles(Person p) {
		return p.toString();
	}

	public String getDetail(Person p) {
		return this.getInfo(p);
	}

}
