package inter;

import java.util.*;
import objects.*;

public interface Search {
	public List<Person> searchPerson(Person similar);
	public List<Person> searchPerson(Person similar, Address addr);
	public List<Person> searchPerson(Person similar, byte age);

}
