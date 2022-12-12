package Truu_Tuong;

public abstract class Feline extends Animal {

	private String Feline_name;
	private int Feline_age;

	// contructor
	public Feline(String animal_Name, String animal_eat, String feline_name, int feline_age) {
		super(animal_Name, animal_eat);
		Feline_name = feline_name;
		Feline_age = feline_age;
	}

	// getter and setter
	@Override
	public String Animal_behavior() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFeline_name() {
		return Feline_name;
	}

	public void setFeline_name(String feline_name) {
		Feline_name = feline_name;
	}

	public int getFeline_age() {
		return Feline_age;
	}

	public void setFeline_age(int feline_age) {
		Feline_age = feline_age;
	}

	@Override
	public String Animal_kingdom() {
		// TODO Auto-generated method stub
		return null;
	}

}
