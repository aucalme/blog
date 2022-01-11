package edu.java.conditional07;

import java.util.Random;

public class ConditionalMain07 {

	public static void main(String[] args) {
		//1.
		// 0 이상 10 이하의 정수 난수 2개를 만들어서 변수에 저장.
		//두 숫자의 차이(큰 수 - 작은 수 )를 출력

		Random rand = new Random();
		
		int number1 = rand.nextInt(11);
		System.out.println("number1 = "+ number1);
		
		int number2 = rand.nextInt(11);
		System.out.println("number2 = "+ number2);
		
		if (number1>number2) {
			System.out.println(number1-number2);
		}else {
			System.out.println(number2-number1);
		}
		
		
		//2.
		//0이상 10미만의 정수 난수를 1개를 만들어서 변수에 저장.
		//정수가 짝수인지 홀수인지를 출력
		
		int number3 = rand.nextInt(10);
		System.out.println("number3 = "+ number3);
		if (number3 %2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	
	}

}
