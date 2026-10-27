package mvcpractice01;

import java.util.ArrayList;
import java.util.List;

import mvcpractice02.News;

public class Service {

	private List<Cafe> cafes = new ArrayList<>();
	
	
	public void create(String name, int price) {
		cafes.add(new Cafe("크림브륄레", 9500));
		cafes.add(new Cafe("퀸즈 캐롯", 6800));
		cafes.add(new Cafe(name, price));

	}
	public List<Cafe> read() {
		return cafes;
		

	}
	public void remove(String name) {
		for(int i = 0; i < cafes.size(); i ++) {
			if(cafes.get(i).getName().equals(name)) {
				cafes.remove(i);
			}
		}
	}
}
