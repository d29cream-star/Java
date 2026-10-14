package objectpractice02;

public class Box {

	private String texture;
	private int height;
	
	public void setTexture(String texture) {
		this.texture = texture;
	}
	public String getTexture() {
		return texture;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	public void pileup() {
		System.out.println(texture + " 상자를 쌓습니다.");
		height++;
	}
	public void remove() {
		System.out.println(texture + " 상자를 제거합니다.");
		height--;
	}
	
}
