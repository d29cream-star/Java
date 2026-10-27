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
		nameCheck(s.getTitle());
		priceCheck(s.getPrice());
		shoppings.add(s);

	}

	public void nameCheck(String title) {
		for (Shopping s : shoppings) {
			if (s.getTitle().equals(title)) {
				throw new DuplicateNameException("이미 등록된 제목입니다.");
			}
		}
	}
	public void priceCheck(int price) {
		for (Shopping s : shoppings) {
			if(s.getPrice() > 0) {
				throw new InvalidPriceException("가격은 음수일 수 없습니다.");
				
			}
		}
	}

	public List<Shopping> read() {
		return shoppings;
	}

	public void remove(String title) {
		for(int i = 0; i < shoppings.size(); i ++) {
			if(shoppings.get(i).getTitle().equals(title)) {
				shoppings.remove(i);
				return;
			}
		}
		throw new ShoppingNotFoundException("등록하지 않은 제품입니다.");
	}

	public void update(String title, int newPrice) {
		List<Shopping> shoppings = new ArrayList<>();
		for (Shopping s : shoppings) {
			if (s.getTitle().equals(title)) {
				s.setPrice(newPrice);
				return;
			}
		}
	}
}
