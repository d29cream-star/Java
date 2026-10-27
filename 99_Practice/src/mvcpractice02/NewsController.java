package mvcpractice02;

import java.util.List;

public class NewsController {

	private NewsService ns = new NewsService();
	
	public void create(String name, String publisher) {
		ns.create(name, publisher);
	}
	
	public List<News> read() {
		return ns.read();
	}
	public void update(String name, String updateName, String publisher) {
		ns.update(name, updateName, publisher);
		
	}
	public void delete(String name) {
		ns.delete(name);
	}
}
