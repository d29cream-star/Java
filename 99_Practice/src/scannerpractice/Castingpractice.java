package scannerpractice;

public class Castingpractice {

	public static void main(String[] args){
		// 'a'
		System.out.println('a');
		System.out.println('a'+1);
		System.out.println('a'*2);
		System.out.println(3+'a');
		System.out.println((int)'a');
		System.out.println('a'+'b');
		System.out.println((char)'a');
		System.out.println((char)'a'+(char)'b');
		System.out.println((char)'a'+3);
		System.out.println((char)('a'+ 3));
		
		
		//"a"
		System.out.println("a");
		//System.out.println(((int)"a"); 에러남
		//System.out.println((char)"a"); 에러남
		System.out.println("a" + 1 + 1);
		System.out.println(1 + 1 + "a");
		System.out.println("1" + 2 + 3);
		System.out.println("()이걸 출력해보자");
		System.out.println(" ''' 이걸 출력해보자 " );
		//System.out.println(" ""이걸 출력해보자"); ""출력 에러
		System.out.println((String)"이렇게 하면?");;
		
		System.out.println('1'+"a");
	
		
		//double
		System.out.println(11.1);
		System.out.println(11.1+11.1);
		System.out.println((int)11.1);
		System.out.println((int)11.1 + (int)11.1);
		System.out.println((int)11.1+11.1);
		System.out.println((int)(11.1+11.1));
		System.out.println((double)11.1);
		System.out.println((double)11.1+11.1);
		System.out.println((double)11.1 + (double)11.1);
		System.out.println((double)(22.2));
		System.out.println((double)(5/2));
		
		
	
	}
}
