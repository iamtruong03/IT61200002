// De 1
package OnThi_De1;

// Cau 1
public class triangle {

	private int canh1;
	private int canh2;
	private int canh3;

	// contructor
	public triangle() {

	}

	public triangle(int canh1, int canh2, int canh3) {
		super();
		this.canh1 = canh1;
		this.canh2 = canh2;
		this.canh3 = canh3;
	}

	// getter and setter
	public int getCanh1() {
		return canh1;
	}

	public void setCanh1(int canh1) {
		this.canh1 = canh1;
	}

	public int getCanh2() {
		return canh2;
	}

	public void setCanh2(int canh2) {
		this.canh2 = canh2;
	}

	public int getCanh3() {
		return canh3;
	}

	public void setCanh3(int canh3) {
		this.canh3 = canh3;
	}

	// to String
	@Override
	public String toString() {
		return "triangle [canh1=" + canh1 + ", canh2=" + canh2 + ", canh3=" + canh3 + "]";
	}

	// Chu vi
	public static float ChuVi(int canh1, int canh2, int canh3) {
		float cv;
		cv = canh1 + canh2 + canh3;
		System.out.println("Chu vi cua tam giac: " + cv);
		return cv;

	}

	// Dien tich
	public static float DienTich(int canh1, int canh2, int canh3) {
		System.out.print("Dien tich cua tam giac: ");
		return 0;
	}

	public static void main(String[] args) {

		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("Nhap canh1: ");
		int canh1 = in.nextInt();
		System.out.print("Nhap canh2: ");
		int canh2 = in.nextInt();
		System.out.print("Nhap canh3: ");
		int canh3 = in.nextInt();

		// dieu kien nhap tam giac
//		if () {
//			
//		} else {
//			
//		}

		ChuVi(canh1, canh2, canh3);
		DienTich(canh1, canh2, canh3);

		// Cau2

	}
}
