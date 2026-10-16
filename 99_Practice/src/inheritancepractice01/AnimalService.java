package inheritancepractice01;

public class AnimalService {

	private Dog d = new Dog();
	
	public void join(Dog d) {
		this.d = d; //여기에서 일치여부 쓰기구나!
		
	}
	public Dog check(String name) {
		return check(name);
	}
	
}
