package inheritancepractice01;

public class AnimalService {

	private Dog d = new Dog();
	
	public Dog join(Dog d) {
		this.d = d;
		return d;
	}
		//System.out.println(d);
		//System.out.println(this.d);
		
		

	public String check(name) {
		if(d.getName().equals(name)) {
			return this.d;
		}
		

	}
	
}
