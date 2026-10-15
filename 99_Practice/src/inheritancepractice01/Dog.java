package inheritancepractice01;

public class Dog extends Animal{

	private String species;
	
	public Dog() {
		super();
	}
	public Dog(String name, int age, String species) {
		super(name, age);
		this.species = species;
	
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	@Override
	public String toString() {
		return super.toString() + " species = " + species;
	}
	
	
}
