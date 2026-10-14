
package com.kh.chap01.abstraction.model.vo;

public class Character {

	public String nickname;
	public int level;
	public String job;
	public String hairSytle;

	public Character() {
		
	}
	public Character(String nickname, int level, String job, String hairSytle) {
		this.nickname = nickname;
		this.level = level;
		this.job = job;
		this.hairSytle = hairSytle;
		
	}
	
	
	
	public void jump() {
		System.out.println(nickname + "이(가) 점프합니다.");
		level--;
	}

	public void attack() {
		System.out.println(nickname + "이(가) 공격합니다.");
		level++;

	}

}
