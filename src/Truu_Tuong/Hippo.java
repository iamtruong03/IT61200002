package Truu_Tuong;

public class Hippo extends Animal {

	private int Hippo_age;

	// contructor
	public Hippo(String animal_Name, String animal_eat, int hippo_age) {
		super(animal_Name, animal_eat);
		Hippo_age = hippo_age;
	}

	// getter and setter
	public int getHippo_age() {
		return Hippo_age;
	}

	public void setHippo_age(int hippo_age) {
		Hippo_age = hippo_age;
	}

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
