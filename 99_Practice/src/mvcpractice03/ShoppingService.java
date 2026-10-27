package mvcpractice03;

import java.util.ArrayList;
import java.util.List;

public class ShoppingService {

	private List<Shopping> shoppings = new ArrayList<>();
	
	{
		shoppings.add(new Shopping("팸퍼스 낮밤 패키지 팬티형", 267300, 28));
		shoppings.add(new Shopping("올실리콘 마카롱 쪽쪽이", 23900, 33));
		shoppings.add(new Shopping("양말", 9000, 50));
	}
	
	public void create(Shopping s) {
		shoppings.add(s);
		
	}
	public List<Shopping> read() {
		return shoppings;
	}
	
	
	
	
	
	public void remove() {
		
	}
	public void update(String title, int newPrice) {
		List<Shopping> shoppings = new ArrayList<>();
		for(Shopping s : shoppings ) {
			if(s.getTitle().equals(title)) {
				s.setPrice(newPrice);
				return; 
			}
		}
		
	}
}
