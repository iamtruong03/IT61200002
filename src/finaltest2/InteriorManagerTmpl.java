package finaltest2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InteriorManagerTmpl implements InteriorManager {

	// HashMap: la 1 anh xa du lieu, key- values ( key k dc trung, values dc trung)
	private HashMap<Interior, Product> list;

	public InteriorManagerTmpl() {
		this.list = new HashMap<>();

	}

	@Override
	public boolean addInterior(Product p) {
		// TODO Auto-generated method stub
		try {
			if (this.list.containsKey(p.getProduct_id())) {
				Product temp = this.list.get(p.getProduct_id());
				int new_total = temp.getProduct_total() + p.getProduct_total();
				temp.setProduct_total(new_total);
				this.list.replace(p.getProduct_id(), temp);
			} else {
				this.list.put(p.getProduct_id(), p);
			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

//	@Override
//	public boolean addInterior(Product p) {
//		// TODO Auto-generated method stub
//
//		try {
//			if (this.list.containsKey(p.getProduct_id())) {
//				Product temp = this.list.get(p.getProduct_id());
//
//				int new_Total = temp.getProduct_total() + p.getProduct_total();
//
//				temp.setProduct_total(new_Total);
//
//				this.list.replace(p.getProduct_id(), temp);
//
//			} else {
//				this.list.put(p.getProduct_id(), p);
//			}
//			return true;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return false;
//	}

	@Override
	public boolean editInterior(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delInterior(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub

		List<Product> tmp = new ArrayList<>();

		for (Map.Entry<Interior, Product> in : this.list.entrySet()) {
			tmp.add(in.getValue());
		}
		return tmp;
	}

	@Override
	public List<Product> searchInterior(String name) {
		// TODO Auto-generated method stub

		List<Product> results = new ArrayList<>();

		for (Map.Entry<Interior, Product> in : this.list.entrySet()) {

			if (in.getValue().getProduct_name().contains(name)) {
				results.add(in.getValue());
			}
		}

		return results;
	}

	@Override
	public double getTotalPrice() {
		// TODO Auto-generated method stub
		// 1 kho sp co nhieu sp, 1 sp co sl nhieu, kich thuoc, chat lieu

		double totalPrice = 0;

		for (Map.Entry<Interior, Product> in : this.list.entrySet()) {
			totalPrice += in.getValue().getPrice();
		}

		return totalPrice;
	}

}
