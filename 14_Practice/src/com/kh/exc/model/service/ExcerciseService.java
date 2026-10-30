package com.kh.exc.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.exc.exception.DuplicateNameException;
import com.kh.exc.exception.ExcerciseNotFoundException;
import com.kh.exc.model.dto.Excercise;

public class ExcerciseService {

	List<Excercise> excercises = new ArrayList<>();

	{
		excercises.add(new Excercise("데드리프트", 10, 45, "등"));
		excercises.add(new Excercise("핵스쿼트", 10, 45, "허벅지"));
		excercises.add(new Excercise("레그 익스텐션", 30, 45, "허벅지"));
	}

	public List<Excercise> read() {
		return excercises;

	}

	public void save(Excercise e) {
		nameCheck(e.getName());
		excercises.add(e);
	}

	public void nameCheck(String name) {
		for (Excercise e : excercises) {
			if (e.getName().equals(name)) {
				throw new DuplicateNameException("이미 등록된 운동입니다.");
			}
		}
	}

	public void remove(String name) {
		for (int i = 0; i < excercises.size(); i++) {
			if (excercises.get(i).getName().equals(name)) {
				excercises.remove(i); 
				return;
			}
		}
			
		throw new ExcerciseNotFoundException("등록하신 운동이 없습니다.");
	}
	public List<Excercise> findByTarget(String target) {
		return excercises.stream()
						.filter(e -> e.getTarget().equals(target))
						.toList();
	}
	public void updateWeight(String name, int newWeight) {
		for(Excercise e : excercises) {
			if(e.getName().equals(name)) {
				e.setWeight(newWeight);
				return;
			}
		}
	throw new ExcerciseNotFoundException("해당 운동명이 없습니다.");
}
}
