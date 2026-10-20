package inheritancepractice01;

public class AnimalController {

	private AnimalService as = new AnimalService();

	public Animal join(int num, String name, int age, String species, String color) {

		Animal result = as.join(num, name, age, species, color);
		return result;
	}

	public Animal check(String name) {
		Animal result = as.check(name);
		return result;
	}
}
