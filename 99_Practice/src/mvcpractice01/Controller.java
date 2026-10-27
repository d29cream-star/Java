package mvcpractice01;

import java.util.List;

public class Controller {

	private Service s = new Service();
	
	public void create(String name, int price){
		s.create(name, price);
	}

	
	public List<Cafe> read() {
		return s.read();
		
	}
	public void remove(String name) {
		s.remove(name);
	}
}

