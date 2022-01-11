package edu.java.loop06;

public class LoopMain06 {

	public static void main(String[] args) {
		// 반복문에서 break, continue
		// break: 반복문 블록을 실행 중에 break를 만나면, break가 포함된 가장 가까운 반복문 블록을 종료
		// continue: 반복문 블록을 실행중에 continue를 만나면, continue 아래쪽 코드는 모두 무시하고
		// 그 다음 반복 과정을 수행함.
		
		for (int n = 1; n <= 5; n++) {
			System.out.println(n);
			if(n==3) {
				break;
			}
		}
		System.out.println("--------");
		
		for (int n = 1; n<=5; n++) {
			if(n == 3) {
				continue;
			}
			System.out.println(n);
		}
	}

}
