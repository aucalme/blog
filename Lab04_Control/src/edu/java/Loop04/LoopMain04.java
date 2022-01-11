package edu.java.Loop04;

public class LoopMain04 {

	public static void main(String[] args) {
		// 구구단 2단을 아래와 같은 형식으로 출력

		for(int i = 1; i <=9; i++) {
			System.out.println("2 X "+ i + " = " + 2*i);
		}
		
		System.out.println("------");
		System.out.println("1부터 10까지 합");
		int sum = 0;
	
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("======");
		System.out.println("1부터 100까지 정수들 중에서 짝수들의 합");
		int s = 0;
		
		for (int i =1; i <=100; i++) {
			if (i % 2 == 0)
				s += i;
		}
		System.out.println("sum = "+ s);
		
		System.out.println("=====");
		System.out.println("1부터 100까지 정수들 중에서 홀수들의 합");
		sum = 0;
		for(int n = 1; n <100; n +=2) {
			sum += n;
		}
		System.out.println("홀수들의 합 = " + sum);
			
	}

}
