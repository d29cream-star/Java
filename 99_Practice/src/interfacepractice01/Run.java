package interfacepractice01;

public class Run {

	public static void main(String[] args) {

		Payment[] pays = {new Card(), new Cash(), new Point()};
		for(int i = 0; i <pays.length;i++) {
			System.out.println(pays[i].pay(500));
		}
	
	}

}
