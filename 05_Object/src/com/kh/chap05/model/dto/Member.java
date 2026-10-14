package com.kh.chap05.model.dto;

public class Member {

//필드부
	private String userId;
	private String userPwd;
	private String nickName;
	
	
//생성자부
	public Member() {
		System.out.println("생성자 호출");
		
	}
	public Member(String userId) {
		System.out.println("아이디 값 초기화");
		this.userId = userId;	
	}
	public Member(String userId, String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
	}
	
	
	
//메소드부
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;

	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNickName() {
		return nickName;
	}
	public String info() {
		String info = " 사용자 아이디: " + userId + " 사용자 비밀번호: " + userPwd + " 사용자 닉네임 : " + nickName+ " 입니다.";
		return info;
	}

}
