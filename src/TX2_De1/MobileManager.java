package TX2_De1;

import java.util.*;

public interface MobileManager {
	public boolean addMobile(Mobile m);
	public boolean editMobile(Mobile m);
	public boolean delMobile(Mobile m);
	
	public List<Mobile> searchMobile(String name);
	
	public List<Mobile> sortedMobile(double price);
	

}
