
package com.kh.chap05.run;

import com.kh.chap05.model.dto.Member;

public class Run {

	public static void main(String[] args) {

		Member member = new Member();
		System.out.println(member.info());
		
	
		Member member1 = new Member("user01");
		System.out.println(member1.info());

		Member member2 = new Member("user02", "pass02");
		System.out.println(member2.info());
	}

}
