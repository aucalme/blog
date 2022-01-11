package edu.java.member.view;

import edu.java.member.controller.MemberDao;
import edu.java.member.controller.MemberDaoImpl;
import edu.java.member.model.Member;

// 클래스나 인터페이스에서 선언된 public static 멤버 변수 이름을 import하는 방법:
import static edu.java.member.view.MainMenu.*;

import java.util.Scanner;

// MVC(Model-View-Controller) 디자인 패턴
// Model: 데이터 저장을 위한 클래스. VO(Value Object), DTO(Data Transfer Object).
// - edu.java.member.model.Member
// View: UI(User Interface)를 담당하는 클래스.
// - edu.java.member.view.MemberMain
// Controller: 프로그램의 특정 로직(기능, 비즈니스 로직)을 담당하는 클래스. DAO(Data Access Object).
// - edu.java.member.controller.MemberDao, MemberDaoImpl

public class MemberMain {
	// field(member variable)
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		MemberDao dao1 = MemberDaoImpl.getInstance();
		MemberDao dao2 = MemberDaoImpl.getInstance(); 
		
		// 회원 관리 프로그램 메인(View)
		System.out.println("*** 회원 관리 프로그램 ***");
		
		boolean run = true;
		while(run) {
			// 메인 메뉴를 보여주고, 사용자가 메뉴(기능)를 선택
			int menu = chooseMenu();
			switch(menu) {
			case QUIT:
				run = false;
				break;
			case SELECT_ALL:
				selectAllMembers();
				break;
			case SELECT_BY_INDEX:
				selectMemberByIndex();
				break;
			case INSERT:
				insertNewMember();
				break;
			case UPDATE:
				updateMemberInfo();
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요...");
			} // end switch
			
		} // end while
		
		System.out.println("*** 회원 관리 프로그램 종료 ***");
	} // end main()

	private static void updateMemberInfo() {
		System.out.println();
		System.out.println("----- 회원 정보 수정 화면 -----");
		//TODO:
		// 변경할 인덱스 입력, 변경할 패스워드 입력
		// result = dao.update(index, password);
		// 업데이트 결과를 출력
		
	}

	private static void selectMemberByIndex() {
		System.out.println();
		System.out.println("----- 인덱스 검색 화면 -----");
		//TODO:
		// 인덱스 입력>>
		// Member = dao.select(index)
		// Member 출력
		
	}

	private static void selectAllMembers() {
		System.out.println();
		System.out.println("----- 전체 회원 목록 -----");
		//TODO:
		// Member[] = dao.select();
		// for(Member m : 배열) {출력}
		
	}

	private static void insertNewMember() {
		System.out.println();
		System.out.println("----- 회원 가입 -----");
		//TODO:
		// ID 입력
		// PW 입력
		// Member 객체 생성
		// return = Dao.insert(member);
		// 회원 가입 결과 출력
		
	}

	private static int chooseMenu() {
		showMainMenu();
		String s = scanner.nextLine(); // 문자열을 입력받음.
		int menu = Integer.parseInt(s); // 문자열을 int 기본 타입으로 변환
		return menu;
	}
	
	private static void showMainMenu() {
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		System.out.println("[1] 전체검색 [2] 인덱스 검색 [3] 회원가입 [4] 정보수정 [0] 종료");
		System.out.println("---------------------------------------------------------------");
		System.out.println("선택>>>");
	}

} // end class MemberMain 
