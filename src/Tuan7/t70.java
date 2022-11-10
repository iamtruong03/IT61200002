// tự học trước Tuần 7
 package Tuan7;

public class t70 {
	public static void main(String[] args ) {

		java.util.Scanner in =
				new java.util.Scanner(System.in);
				
		// nhap ten
		// System.out.print("Nhap ten cua ban: ");
		// String name = in.next();
		// System.out.println("Ten cua ban la: " + name);

		// in hoa chu cai dau tien

		//	
		// System.out.print("Vui long nhap x: ");
		// int x = in.nextInt();
		// System.out.print("Vui long nhap y: ");
		// int y = in.nextInt();
		// System.out.println("x + y = " +(x + y));

		//
		Variables();


		
	}

	// static chỉ đi với static
	public static void Variables(){
		//biến là 1 vùng ram được đặt tên, chiếm 1 số byte nhất định tùy loại dữ liệu/ thông tin mà nó sẽ chứa bên trong- data type - hình thức data số, chữ, ảnh...
		//biến là cách đặt tên cho 1 đại lượng, 1 giá trị - đơn, phức

		int age = 18;
		int a = 10, b;
		b = 100;
		// tốn 12 byte trong RAM
		System.out.println("age: " + age);

		int yob = 2003;
		age = 2022 - yob;

		System.out.println("age: " + age);

		
	}

}
