package inter;

import java.util.ArrayList;
import java.util.List;

import objects.Address;
import objects.Person;

public class Computer implements Product, PersonManager {

	private short computer_id;
	private String computer_name;
	private String computer_summary;
	private String computer_detail;
	private double computer_price; 
	
	//
	public Computer() {
		
	}
	@Override
	public double getPrice(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getIntro(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDetail(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Person> statisticPerson(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Person> statisticPerson(Address addr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Person> statisticPerson(Person similar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Person> statisticPerson(byte min_age, byte max_age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> searchPerson(Person similar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> searchPerson(Person similar, Address addr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> searchPerson(Person similar, byte age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addPerson(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editPerson(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delPerson(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Person> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Person> getAll(short page, byte total) {
		// TODO Auto-generated method stub
		return null;
	}

}
