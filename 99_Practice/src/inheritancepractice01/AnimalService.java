package inheritancepractice01;

public class AnimalService {
	
	private Animal d = new Dog();
	private Animal c = new Cat();
	private Animal[] animals = {d, c};
	
	public Animal join(int num, String name, int age) {
		if (num == 1) {
			d.setName(name);
			d.setAge(age);
			return d;
		}else if(num == 2){
			c.setName(name);
			c.setAge(age);
			return c;
		}else{return null;}
	}

	public Animal check(String name) {
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] != null && animals[i].getName().equals(name)) {
				return animals[i];
			}
		}
		return null;}
	
}
