// tren lop tuan 7
  package Tuan7;

 public class t71 {
	public static void main(String[] arg) {
		
		java.util.Scanner in = 
					new java.util.Scanner(System.in);
		
		System.out.print("Nhap n = ");			
		int n = in.nextInt();

		boolean flag = true;
		if(n<2) {
			flag = false;
		}else{
			for(int v=2; v <= (int)(Math.sqrt(n)); v++) {
				if (n%v==0) {
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("n = "+n+" La so nguyen to");
		}else {
				System.out.println("n = "+n+" Khong la so nguyen to");
			}
		



	}

}
