package com.kh.pro.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.pro.exception.DuplicateNameException;
import com.kh.pro.exception.InvalidPriceException;
import com.kh.pro.exception.PropertyNotFoundException;
import com.kh.pro.model.dto.Property;

public class PropertyService {

	private List<Property> propertys = new ArrayList<>();

	{
		propertys.add(new Property("좋은빌라", 10000, "상", "종로구"));
		propertys.add(new Property("나이스아파트", 50000, "최상", "동작구"));
		propertys.add(new Property("굿오피스텔", 8000, "상", "종로구"));
		propertys.add(new Property("Good빌라", 12000, "중", "동작구"));
	}

	public List<Property> read() {
		return propertys;
	}

	public void save(Property p) {
		nameCheck(p.getName());
		priceCheck(p.getPrice());
		propertys.add(p);
	}

	public void nameCheck(String name) {
		for (Property p : propertys) {
			if (p.getName().equals(name)) {
				throw new DuplicateNameException("이미 동일한 상품이 있습니다.");
			}

		}
	}

	public void priceCheck(int price) {
		for (Property p : propertys) {
			if (price >= 5000 || price <= 15000) {
				throw new InvalidPriceException("가격 범위를 벗어났습니다.");
			}
		}
	}

	public void delete(String name) {
		for (int i = 0; i < propertys.size(); i++) {
			if (propertys.get(i).getName().equals(name)) {
				propertys.remove(i);
				return;
			}
		}
	}
	public List<Property> findByLocation(String location) {
		return propertys.stream()
						.filter(p -> p.getLocation().equals(location))
						.toList();
	}
	public void update(String name, int newPrice) {
		for (Property p : propertys) {
			if(p.getName().equals(name)) {
				p.setPrice(newPrice);
				return;
			}
			throw new PropertyNotFoundException("해당 상품을 찾을 수 없습니다.");
		}
	}

}
