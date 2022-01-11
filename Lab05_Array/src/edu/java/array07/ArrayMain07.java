package edu.java.array07;

import java.util.Random;

public class ArrayMain07 {

	public static void main(String[] args) {
		//1 ~ 5 사이의 정수 난수 3개를 저장하는 배열
		//3개의 숫자는 모두 달라야 함.
		
		Random rand = new Random(); //난수 만드는 도구
		
		int[] array = new int[3];// 정수 3개를 저장하는 배열
		
		int count = 0; //배열에 난수가 저장된 개수
		while (count < 3) {
			int r = rand.nextInt(5)+1;
			System.out.println(r);
			
			boolean isSame = false; //배열에서 같은 숫자가 있으면 true로 바꿀 변수
			for (int i = 0; i < count; i++) {
				if (array[i] == r) {
					isSame = true;
				}
			}
			if (isSame == false) {
				array[count] = r;
				count++;
			}
				
		}
		
		
		}
		
		

}
