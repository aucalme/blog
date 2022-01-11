package edu.java.modifier07;

public class ModifierMain07 {

	// main 메서드가 static으로 선언되는 이유:
	// Java Runtime이 프로그램을 실행하기 위해서 가장 먼저 호출하는 메서드. 
	// 인스턴스 생성 없이 호출하기 위해서.
	public static void main(String[] args) {
		// StaticTest 클래스의 인스턴스를 생성하기 전에 static 필드(멤버 변수) 값을 출력
		System.out.println(StaticTest.staticVariable); // static 필드는 이미 메모리에 기본값으로 생성되어 있음.
		
		// StaticTest 클래스의 인스턴스를 생성하기 전에 static 메서들르 호출할 수 있음!
		StaticTest.printVariables2();
		
		System.out.println();
//		test1(); // static 메서드는 static이 아닌(non-static) 메서드를 호출할 수 없다!
		test2(); // static 메서드는 static 메서드만 호출 가능.
		
		//test1() 메서드를 사용하기 위해서는 인스턴스를 먼저 생성한 후 참조 변수를 통해서 사용함.
		ModifierMain07 inst = new ModifierMain07();
		inst.test1();
		
		// StaticTest 클래스의 인스턴스를 생성.
		StaticTest test = new StaticTest();
		// 인스턴스 변수와 인스턴스 메서드는 참조 변수를 사용해서 사용함.
		System.out.println(test.instanceVariable);
		test.printVariables();
	}
	
	public void test1() {
		System.out.println("메인 인스턴스 메서드");
	}

	public static void test2() {
		System.out.println("메인 static 메서드");
	}
}// end class ModifierMain07
