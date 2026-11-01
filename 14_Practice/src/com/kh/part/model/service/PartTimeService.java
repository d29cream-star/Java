package com.kh.part.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.kh.part.exception.DuplicateNameException;
import com.kh.part.exception.InvalidPaymentException;
import com.kh.part.model.dto.PartTime;

public class PartTimeService {
	private List<PartTime> partTimes = new ArrayList<>();

	{
		partTimes.add(new PartTime("스타벅스", 5, 11200, "토요일"));
		partTimes.add(new PartTime("메가커피", 6, 10320, "수요일"));
		partTimes.add(new PartTime("써브웨이", 3, 10500, "토요일"));

	}

	public List<PartTime> read() {
		return partTimes;
	}

	public void save(PartTime p) {
		locationCheck(p.getLocation());
		paymentCheck(p.getPayment());
		partTimes.add(p);
	}

	public void locationCheck(String location) {
		for (PartTime p : partTimes) {
			if (p.getLocation().equals(location)) {
				throw new DuplicateNameException("동일한 알바 장소가 존재합니다.");
			}
		}
	}

	public void paymentCheck(int payment) {
			if (payment < 10320) {
				throw new InvalidPaymentException("최저시급을 만족하지 않습니다.");
			}
		}
	public void delete(String name) {
		for(int i = 0; i < partTimes.size(); i ++) {
			if(partTimes.get(i).getLocation().equals(name)) {
				partTimes.remove(i);
				return;
			}
		}
		
	}
	public List<PartTime> findByDate(String date) {
		return partTimes.stream()
						.filter(p -> p.getDate().equals(date))
						.toList();
		
	}
	public void update(String location, int NewTime) {
		for(PartTime p : partTimes) {
			if(p.getLocation().equals(location)) {
				p.setTime(NewTime);
				return;
			}
		}
	}
}

