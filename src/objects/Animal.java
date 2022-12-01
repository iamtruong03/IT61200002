package objects;

public abstract class Animal {
	protected String Animal_Name;
	protected String Animal_eat;

	// truu tuong
	public abstract String findCanine();
	public abstract String findFeline();
	
	// tuong minh
	
	// contructor
	public Animal(String animal_Name, String animal_eat) {
		super();
		Animal_Name = animal_Name;
		Animal_eat = animal_eat;
	}
	
	// getter and setter
	public String getAnimal_Name() {
		return Animal_Name;
	}
	public void setAnimal_Name(String animal_Name) {
		Animal_Name = animal_Name;
	}
	public String getAnimal_eat() {
		return Animal_eat;
	}
	public void setAnimal_eat(String animal_eat) {
		Animal_eat = animal_eat;
	}

}
