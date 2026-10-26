package mvcpractice02;

public class News {

	private String name;
	private String publisher;
	
	
	public News(String name, String publisher) {
		super();
		this.name = name;
		this.publisher = publisher;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "News [name=" + name + ", publisher=" + publisher + "]";
	}
	
	
}
