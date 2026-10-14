package objectpractice01;

public class GameCharacter {

	public String nickName;
	public int level;
	public String job;
	public String gender;
	
	public void attack() {
		System.out.println("공격하다.");
	}
	public void defend() {
		System.out.println("방어하다.");
	}
	public void levelUp() {
		System.out.println("레벨업하다.");
	}
	public void win() {
		System.out.println("승리하다.");
	}
}
