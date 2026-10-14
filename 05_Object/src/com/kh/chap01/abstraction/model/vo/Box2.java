
package com.kh.chap01.abstraction.model.vo;

import java.util.ArrayList;

public class Box2 {

	public String texture;
	public int[] point = {0,0,0};
	//ArrayList<String> point = new ArrayList<>();
	//point.add("사과");
	
	public Box2(String texture, int[] point) {
		this.texture = texture;
		this.point = point;
	}

	public void moveright() {
		System.out.println("오른쪽으로 1만큼 이동합니다.");}
}
