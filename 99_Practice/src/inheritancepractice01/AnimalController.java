package inheritancepractice01;

public class AnimalController {

	private AnimalService as = new AnimalService();
	
	public void join(String name, int age, String species) {
		Dog d = new Dog(name, age, species);
		
		as.join(d);
		}
	
	public Dog check(String name) {
	return as.check(name);
	}

}
