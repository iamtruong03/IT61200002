package Truu_Tuong;

public abstract class Canine extends Animal {

	private String Canine_name;
	private int Canine_age;

	// contructor
	public Canine(String animal_Name, String animal_eat, String canine_name, int canine_age) {
		super(animal_Name, animal_eat);
		Canine_name = canine_name;
		Canine_age = canine_age;
	}

	// setter and getter
	public String getCanine_name() {
		return Canine_name;
	}

	public void setCanine_name(String canine_name) {
		Canine_name = canine_name;
	}

	public int getCanine_age() {
		return Canine_age;
	}

	public void setCanine_age(int canine_age) {
		Canine_age = canine_age;
	}

	//
	@Override
	public String Animal_behavior() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Animal_kingdom() {
		// TODO Auto-generated method stub
		return null;
	}

}
