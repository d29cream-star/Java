package com.kh.khworld.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.khworld.exception.DuplicateNameException;
import com.kh.khworld.model.dto.Attraction;

public class KhWorldService {

	private List<Attraction> attractions = new ArrayList<>();

	{
		// 초기화 블럭
		// System.out.println("초기화블럭");
	}

	static {
		// 스태틱 블럭
		// System.out.println("스태틱블럭");
	}

	public KhWorldService() {
		attractions.add(new Attraction("콩X고질라더라이드", "110cm ~ 195cm 탑승 가능", "3F 게임빌리지/스낵바 앞"));
		attractions.add(new Attraction("귀담", "키 제한 없이 탑승 가능", "매직아일랜드 매직캐슬 뒤편"));
		attractions.add(new Attraction("마도신당", "키 제한 없이 탑승 가능", "매직아일랜드 매직캐슬 뒤폰"));
		// System.out.println("생성자블럭");
	}

	public List<Attraction> readAttractions() {
		return attractions;
	}

	/**
	 * @param a : 사용자가 입력한 name, limit, location이 담겨있는 Attraction
	 * @author 조안나
	 * @Since 2026-10-23
	 */
	public void save(Attraction a) {
		nameCheck(a.getName());
		attractions.add(a);
	}

	private void nameCheck(String name) {
		for (Attraction att : attractions) {
			if (att.getName().equals(name)) {
				throw new DuplicateNameException("중복된 이름입니다.");
			}
		}
	}

	public void deleteAttractions(String name) {

		for (int i = 0; i <attractions.size();i ++) {
			if (attractions.get(i).getName().equals(name)) {
				attractions.remove(i);
				break;
			}
		}
	}

}