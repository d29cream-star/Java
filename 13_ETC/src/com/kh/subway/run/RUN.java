package com.kh.subway.run;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.kh.subway.model.dto.Sandwich;
import com.kh.subway.model.service.SandwichFilter;

public class RUN {

	public static void main(String[] args) {

		List<Sandwich> bin = List.of(new Sandwich("램", 8000, "양고기"),
									 new Sandwich("에그마요",5500, "달걀" ),
									 new Sandwich("스파이시 쉬림프", 7500, "새우"),
									 new Sandwich("풀드포크 바베큐", 7000,"돼지고기"),
									 new Sandwich("스파이시 이탈리안", 6500, "페퍼로니"),
									 new Sandwich("로티세리 바베큐 치킨", 7000, "돼지고기"),
									 new Sandwich("이탈리안 비엠티", 6000, "페퍼로니"),
									 new Sandwich("안창비프 & 머쉬룸", 8000, "소고기"),
									 new Sandwich("스테이크 & 치즈", 8000, "소고기")
									 );	
		
		SandwichFilter beefFilter = s -> s.getMaterial().contains("소고기");
		for(Sandwich s : bin) {
			if(beefFilter.test(s)) {
				System.out.println(s.getName());
			}
		}
		SandwichFilter expensiveFilter = s-> s.getPrice() >=7500;
		for(Sandwich s : bin) {
			if(expensiveFilter.test(s)) {
				System.out.println(s.getName());
			}
		}
		
		Predicate<Sandwich> isPork = s -> s.getMaterial().equals("돼지고기");
		for(Sandwich s : bin) {
			if(isPork.test(s)) {
				System.out.println(s.getName());
			}
		}
		
		Function<Sandwich, String> getName = s -> s.getName();
		System.out.println(getName.apply(new Sandwich("에그마요", 3400, "에그")));
		
		
		Consumer<Sandwich> print = s -> System.out.println(s.getMaterial());
		print.accept(new Sandwich("에그마요", 5000,"초 고급 계란"));
		
		
		Supplier<Sandwich>	defaultSand	= () -> new Sandwich("기본", 1000, "없음");
		Sandwich d = defaultSand.get();
		System.out.println(d);
		
		List<Sandwich> reds = new ArrayList<>();
		for(int i =0; i < bin.size(); i ++) {
			if(bin.get(i).getMaterial().equals("페퍼로니")) {
				reds.add(bin.get(i));	
			}
		
		}
		System.out.println(reds);
		
		
		List<Sandwich> red = bin.stream()
								.filter(s-> s.getMaterial().equals("페퍼로니"))
								.toList();
		System.out.println(red);
		
		
		List<String> names = bin. stream()
								.map(s -> s.getName())
								.toList();
		System.out.println(names);
		
		List<String> name = bin. stream()
								.filter(s -> s.getMaterial().equals("페퍼로니"))
								.map(s -> s.getName())
								.toList();
								
		System.out.println(name);
		
		
		List<String> material = bin.stream()
								   .map(s -> s.getMaterial())
								   .distinct()
								   .toList();
		System.out.println(material);
		
		
		bin.stream()
		   .map(s -> s.getMaterial())
		   .collect(Collectors.toSet());
		
		String sands = bin.stream()
						  .map(s -> s.getName())
						  .collect(Collectors.joining(","));
						   
		System.out.println(sands);
		
		String sand = bin.stream()
				  .map(Sandwich :: getName) // getName의 값
				  .collect(Collectors.joining(","));
				   
		System.out.println(sand);
		
		
		Sandwich s = bin.stream()	
						.filter(san -> san.getPrice()> 7000)
						.findFirst() //7000원으로 필터한 값 중 첫번째값
						.orElse(null); //
		
		bin.stream()	
		   .filter(san -> san.getPrice()> 7000)
		   .map(san -> san.getPrice());
		   //.count();
		   //reduce
		   // .forEach(System.out::println;)
		
	}
	
	
}
