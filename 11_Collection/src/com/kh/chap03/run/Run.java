package com.kh.chap03.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.chap03.model.vo.Shop;

public class Run {

	public static void main(String[] args) {

		Set<String> set = new HashSet();

		set.add("안녕하세요");
		set.add("반갑습니다");
		set.add("안녕하세요");
		set.add(new String("반갑습니다."));
		set.add("특징");

		System.out.println(set);

		System.out.println(set.size());

		Set<Shop> shops = new HashSet();
		shops.add(new Shop("프로티너", "단백질박스", 8900));
		shops.add(new Shop("써브웨이", "클럽샌드위치", 7500));
		shops.add(new Shop("영춘옥", "곰탕", 13000));

		System.out.println(shops);

		String s1 = new String("예시"); // 힙
		String s2 = "예시"; // String Pool
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		Shop p1 = new Shop("KH", "자바", 100);
		Shop p2 = new Shop("KH", "자바", 100);
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		
		List li = new ArrayList();
		li.addAll(shops);
		//List li = new ArrayList(shops);
		//for(Shop shop : shops){
		//System.out.println(shop);
		
		
		Iterator<Shop> it = shops.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
			
		}
		
		
		
		
		
	}

}
