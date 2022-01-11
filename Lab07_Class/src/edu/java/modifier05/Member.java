package edu.java.modifier05;

public class Member {
	//field
	private String memberId;
	private String memberPassword;
	
	//constructor - 파라미터 2개인 생성자만 만듦. 기본 생성자는 만들지 않음.
	public Member(String memberId, String memberPassword) {
		this.memberId = memberId;
		this.memberPassword = memberPassword;
	}
	//아이디와 비밀번호에 대한 getter 메서드 작성
	public String getId() {
		return memberId;
	}
	public String getPassword() {
		return memberPassword;
	}
	//비밀번호에 대한 setter 메서드 작성
	public void setPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
}
