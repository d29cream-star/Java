
package com.kh.chap01.abstraction.model.vo;

public class Box {

	public String texture;
	public int x = 0;
	public int y = 0;
	public int z = 0;
	
	public Box() {
		
	}
	public Box(String texture, int x, int y, int z) {
		this.texture = texture;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void pileup() {
		System.out.println(texture + "상자를 쌓습니다.");
		z++;
	}
	public void remove() {
		System.out.println(texture + "상자를 제거합니다.");
		z--;
	}
	public void moveright() {
		System.out.println(texture + "상자를 오른쪽 이동시킵니다.");
		z--; x++; z++; 
	}
	public void moveleft()	{
		System.out.println(texture + "상자를 왼쪽으로 이동시킵니다.");
		z--; x--; z++;
	}
	public void moveup() {
		System.out.println(texture + "상자를 위쪽으로 이동시킵니다.");
		z--; y++; z++;
	}
	public void movedown() {
		System.out.println(texture + "상자를 아래로 이동시킵니다.");
		z--; y--; z++;
	}
}

