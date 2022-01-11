package edu.java.loop08;

public class LoopMain08 {

	public static void main(String[] args) {
		// 구구단을 1단부터 12단까지 출력. 1단은 1까지 2단은 2까지,...,12단은 12단까지 출력
		// break를 사용하는 방법과 break를 사용하지 않는 방법을 생각해 보세요.

		for(int dan = 1; dan <13; dan++) {
			System.out.println(dan +"단");
			
			for (int n = 1; n <10; n++) {
				if (dan+1 == n) {
					break;
				}
				System.out.println(dan+" x "+ n + " = "+( dan * n));
			}
		}
	}

}
