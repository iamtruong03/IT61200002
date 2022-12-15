package objects;

public class testManager {
	public static void main(String[] args) {
		// Khai báo đối tượng địa chỉ
		Address addr = new Address();

		// Khai báo đối tượng sv
		Person s = new Student("Truong", "Nong Minh", (byte) 19, addr, 234_567, "(2021)6120003", "Cong nghe thong tin");
		Person e = new Employee("Truong", "Nong Minh", (byte) 19, addr, 20000, "Worker", (short) 2021);

		//
		Manager SM = new StudentManager();
		Manager EM = new EmployeeManager();
		
		System.out.println(EM.getDetail(e));
		System.out.println(SM.getDetail(s));

	}

}
