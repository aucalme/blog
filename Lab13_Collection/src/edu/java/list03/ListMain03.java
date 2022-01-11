package edu.java.list03;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain03 {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Member 타입을 저장할 수 있는 ArrayList를 생성
		ArrayList<Member> list = new ArrayList<Member>();
		
		// 반복문을 사용해서 
		// 아이디와 비밀번호를 입력받아서 Member 객체를 생성해서
		// ArrayList에 Member 타입 객체 3개를 추가
		for (int i = 0; i < 3; i++) {
			System.out.println("아이디 입력>>");
			String id = scanner.nextLine();
			System.out.println("비밀번호 입력>>");
			String pwd = scanner.nextLine();
			
			Member member = new Member(id, pwd);
			list.add(member);
		}
	
		// 리스트의 내용을 출력 - 각각의 회원의 아이디와 비밀번호가 출력될 수 있도록(toString override 테스트)
		System.out.println(list);
		System.out.println();
		
		//향상 for문 이용해서 리스트 내용 출력
		for(Member m : list) {
			System.out.println(m);
		}
		System.out.println();
		
		// 인덱스 0 위치의 회원 정보 중에서 비밀번호를 변경하고 리스트 내용 출력
		Member m = list.get(0);
		m.setMemberPassword("qwerty");
		//list.get(0).setMemberPassword("abcd1234"); // 메서드 연쇄 호출(chain call)
		System.out.println(list.get(0));
		System.out.println();
		
		// 인덱스 1 위치의 회원 정보를 삭제하고 리스트 내용을 출력
		list.remove(1);
		System.out.println(list);
		System.out.println();
		
		
		// 아이디가 일치하면 같은 회원으로 간주되도록 Member 클래스를 수정
		// 아이디가 일치하는 회원을 리스트에서 삭제하고 리스트 내용을 출력
		Member member = new Member("aaa","111");
		list.remove(member);
		
		System.out.println();
		
		System.out.println(list);
	}

}
