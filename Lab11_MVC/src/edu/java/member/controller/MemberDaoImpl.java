package edu.java.member.controller;

import edu.java.member.model.Member;

// Controller 인터페이스를 구현하는 클래스 - 모든 view 클래스에서 동일한 인스턴스를 사용하도록 singleton 패턴 적용
public class MemberDaoImpl implements MemberDao {
	
	// singleton 디자인 패턴
	// 1) private static 자기자신타입 변수를 선언
	private static MemberDaoImpl instance = null;
	// 2) 생성자를 private으로 선언 - 다른 클래스에서 호출하지 못하도록
	private MemberDaoImpl() {}
	// 3) public static 메서드를 제공해서 오직 한 개의 instance만 생성되도록 함.
	public static MemberDaoImpl getInstance() {
		if(instance == null) {
			instance = new MemberDaoImpl();
		}
		return instance;
	}

	@Override
	public int isert(Member m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member[] select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member select(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(int index, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

}
