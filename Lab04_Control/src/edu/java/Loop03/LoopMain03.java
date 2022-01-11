package edu.java.Loop03;

public class LoopMain03 {

	public static void main(String[] args) {
		// 0,2,4,6,8,10을 한줄씩 출력
		
		for (int i=0;i<=10;i += 2 ) {
			System.out.println(i);
		}
		
		System.out.println("------");
		
		for(int i = 0; i <=5; i++) {
			System.out.println(i * 2);
		}
		
		System.out.println("-----");
		
		for (int i = 0; i<=10; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			
		}

	}

}
