package finaltest2;

import java.util.*;

public class TestInterior {
	public static void main(String[] args) {
		InteriorManager im = new InteriorManagerTmpl();

		// Tao danh sach / kho 10 ma sp
		for (int i = 1; i <= 10; i++) {
			// Ngau nhien so luong

			int total = (int) (Math.random() * 30);
			double price = 4000_000 + Math.random() * 3000_000;

			Interior in = new Interior();
			in.setProduct_id((byte) (Math.random() * 20));
			in.setProduct_total(total);
			in.setProduct_price(price);

			// Them vao danh sach
			im.addInterior(in);

		}
		
		// Hien thi danh sach kho san pham
		List<Product> list = im.getAll();
		list.forEach(item -> System.out.println(item));
		
		// xuat tong gia
		
	}

}
