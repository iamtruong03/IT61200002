package finaltest2;

import java.util.*;

public interface InteriorManager {
	public boolean addInterior(Product p);
	public boolean editInterior(Product p);
	public boolean delInterior(Product p);

	public List<Product> getAll();
	public List<Product> searchInterior(String name);

	public double getTotalPrice();

}
