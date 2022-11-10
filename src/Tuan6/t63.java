//Sử dụng java enum trong câu lệnh switch
package Tuan6;

public class t63 {
	public static void main(String[] args) {
		
		byte i = (byte)(Math.random()*Size.values().length);
		// lay gia tri thanh phan
		Size s = Size.values()[i];
		
		switch(s) {
		case XSMALL:
			System.out.print("Kich thuoc nho rat nho");
			break;
		case SMALL:
			System.out.print("Kich thuoc nho");
			break;
		case MEDIUM:
			System.out.print("Kich thuoc trung binh");
			break;
		case LARGE:
			System.out.print("Kich thuuoc lon");
			break;
		case XLARGE:
			System.out.print("Kihc thuoc rat lon");
			break;
			
		}
		
		
	}
}
