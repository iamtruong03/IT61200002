package Tuan7;
public class Eg4 {
	public static void main (String[] arg ) {
		java.util.Scanner in = 
				new java.util.Scanner(System.in);

		int a = in.nextInt();
		System.out.println("a la: "+a);
		int b = in.nextInt();
		System.out.println("b la:"+b);

		System.out.println("UCLN cua a="+a+",b="+b+",la:");
		int ucln = -1;
		if(a*b!=0) {
			while (a!=b) {
				if (a>b) {
					a = a - b;
				}else {
					b = b - a;
				}
			}


		}ucln =a;
		System.out.println(ucln);
	}

}
