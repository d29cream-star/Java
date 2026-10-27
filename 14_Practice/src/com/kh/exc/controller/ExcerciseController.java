package com.kh.exc.controller;

import java.util.List;

import com.kh.exc.model.dto.Excercise;
import com.kh.exc.model.service.ExcerciseService;

public class ExcerciseController {

	private ExcerciseService es = new ExcerciseService();
	
	public List<Excercise> read() {
		return es.read();
	}
	public void save(String name, int weight, int count, String target) {
		es.save(new Excercise(name, weight, count, target));
	}
	public void remove(String name) {
		es.remove(name);
	}
	public List<Excercise> findByTarget(String target) {
		return es.findByTarget(target);
	}
	public void updateWeight(String name, int newWeight) {
		es.updateWeight(name, newWeight);
	}
}
