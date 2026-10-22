package com.kh.chap04.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.kh.chap04.model.vo.Perfume;

public class Run {

	public static void main(String[] args) {
		
		Map<String, Perfume>perfumes = new HashMap(); 
		System.out.println(perfumes);
		
		perfumes.put("잉글리시 페어 프리지아 코롱", new Perfume("45", "프루티"));
		perfumes.put("샤넬 No.5", new Perfume("60", "플로랄"));
		perfumes.put("취 오드 퍼퓸", new Perfume("480","우디"));
		
		System.out.println(perfumes);
		
		perfumes.forEach((key, value)->{
			System.out.println(key + " : " + value);
		});
		
		Set<String> keySet = perfumes.keySet();
		Iterator<String>itKey = keySet.iterator();
		
		while(itKey.hasNext()) {
			String key = itKey.next();
		}
			
		
	}
}
