package edu.java.modifier05;

public class ModifierMain05 {

	public static void main(String[] args) {
		Member mem1 = new Member("minji0413","비밀번호입니다");
		mem1.setPassword("비밀번호바꿈");
		
		System.out.println("ID: "+mem1.getId());
		System.out.println("PASSWORD: "+ mem1.getPassword());

	}

}
