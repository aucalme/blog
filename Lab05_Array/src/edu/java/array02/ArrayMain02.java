package edu.java.array02;

public class ArrayMain02 {

	public static void main(String[] args) {
		//배열의 선언과 초기화
		//타입[] 변수이름 = new 타입[배열의 원소 개수];
		int[] intArray = new int[5]; // 배열을 생성하면 그 타입의 기본값(숫자인 경우 0)으로 채워짐.
		for (int i = 0; i <intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		
		//타입[] 변수이름 = {값1, 값2, ...};
		String[] stringArray = {"Java","SQL","JSP","Spring","Machine Learning"};
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]+", ");
		}
		
		System.out.println();
		
		//타입[] 변수이름 = new 타입[]{값1,값2,...};
		int[] array = new int[] {1,3,5,7,9};
		//int[] array = {1,3,5,7,9};
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		
		//향상된 for문 (enhanced for statement)
		for (int x : array) {
			System.out.print(x +" ");
		}
		System.out.println();
		
		for(String s : stringArray) {
			System.out.print(s+ ", ");
		}
		System.out.println();
		
		
		
		
	}

}
