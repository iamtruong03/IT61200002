package util;

/**
 * Lập trình hướng đối tượng căn bản<br>
 * <i>Cập nhật: 27/10/2022</i><br>
 * 
 * @author hp
 *
 */

/*
 * this method is used to check a n int valune is prime?<br> <i>Update
 * 27/10/2022</i><br>
 * 
 * @param m - input parameter to check
 * 
 * @return is priem or not?
 */
public class Utilities {
	public static boolean isPrime(int n) {
		boolean flag = true;
		if (n < 2) {
			flag = false;
		} else {
			for (int v = 2; v <= (int) (Math.sqrt(n)); v++) {
				if (n % v == 0) {
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("n=" + n + " La so nguyen to");
		} else {
			System.out.println("n=" + n + " Khong la so nguyen to");
		}
		// tra ve ket qua
		return flag;

	}

	public static int getUCLN(int a, int b) {
		int ucln = -1;

		if (a * b != 0) {
			while (a != b) {
				if (a > b) {
					a = a - b;
				} else {
					b = b - a;
				}
			}
			ucln = a;
		}
		return ucln;
	}

	public static int getUCLN(int a, int b, int c) {
		return Utilities.getUCLN(Utilities.getUCLN(a, b), c);

	}
/**
 * 
 * 
 * @param arg
 */
	public static void main(String[] arg) {

		// int n = (int) (Math.random() * 100);

		// // boolean isPrime = util.isPrime(n);

		// if (Utilities.isPrime(n)) {
		// System.out.print("n=" + n + " la so nguyen to");
		// } else {
		// System.out.print("n=" + n + " khong la so nguyen to");
		// }

		int n = (int) (Math.random() * 100);
		int m = (int) (Math.random() * 100);
		int k = (int) (Math.random() * 100);

		System.out.print("UCLN cua n=" + n + " va m=" + m + " va k=" + k + " la: " + Utilities.getUCLN(n, m));

	}

}
