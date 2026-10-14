package objectpractice02;

public class Dog {

	private String name;
	private String color;
	private String species;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public String Info() {
		String info = color + " " + species + " " + name + "는 " + age + "살 입니다."; 
		 return info;
	}
}
