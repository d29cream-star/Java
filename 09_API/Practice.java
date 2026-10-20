import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice {

	String str = "Hello" + "World";

	public void method4() {

		StringBuffer sb = new StringBuffer();

		sb.append("Hello");
		sb.append("World");
		System.out.println(sb);

		StringBuilder builder = new StringBuilder();
		builder.append("Hello");
		builder.append("World");

		System.out.println(builder);

	}

	public void method5() {
		String str1 = "이 또한 지나가리";
		System.out.println("str1의 길이" + str1.length());

		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력하세요.>");
		String userId = sc.nextLine();
		//if (!(8 <= userId.length() && userId.length() <= 15))
		//	;
		//throw new RuntimeException("다시 입력해주세요.");

		char ch = str1.charAt(0);
		System.out.println(ch);

		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5, 7));

		System.out.println(str1.indexOf("한"));

		String[] emails = { "hong@naver.com", "kim@kh.com" };
		System.out.println(emails[0].substring(0, 4));
		System.out.println(emails[1].substring(0, 3));

		for (String e : emails) {
			System.out.println(e.substring(0, e.indexOf("@")));
		}

		// System.out.println(emails[0].substring(0,emails[0].indexOf("@")));

		String fileName = "flower.jpg";
		// System.out.println(fileName.substring(fileName.indexOf(".")));
		System.out.println(fileName.substring(fileName.indexOf(".") + 1));

		String name = "sdg.sdfa.dsga.a.asdg.sadg.png";
		System.out.println(name.substring(name.lastIndexOf(".") + 1));

		char[] chArr = str1.toCharArray();
		System.out.println(Arrays.toString(chArr));

		new String(chArr).chars().mapToObj(c -> (char) c).forEach(System.out::println);
		for (char c : chArr) {
			System.out.println(c);
		}

		// char[ ]-> String
		System.out.println(String.valueOf(chArr));

		String replaceStr = "엄마손밥상";
		System.out.println(replaceStr.replace("엄마", "아빠"));

		String device = "냉장고, 세탁기, 식기세척기, 청소기";

		String[] devices = device.split(",");
		for (String d : devices) {

		}
		System.out.println("토큰뽑기");
		StringTokenizer stn = new StringTokenizer(device, ",");
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());

		while (stn.hasMoreTokens()) { // 토큰이 남아있으면 true, 없으면 false
			System.out.println(stn.nextToken());
		}

		
		
		
		
	}
}
