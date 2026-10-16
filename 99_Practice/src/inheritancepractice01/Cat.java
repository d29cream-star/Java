package inheritancepractice01;

public class Cat extends Animal{

	private String favorite;

	public Cat() {
		super();
	}

	public Cat(String name, int age, String favorite) {
		super(name, age);
		this.favorite = favorite;
	}

	public String getFavorite() {
		return favorite;
	}

	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	
	@Override
	public String toString() {
		return super.toString() + "선호 사료 : " + favorite;
	}
	
}
