package edu.java.array08;

import java.util.Random;

public class ArrayMain08 {

	public static void main(String[] args) {
		// 성적 처리 프로그램
		
		Random rand = new Random();//난수를 이용해서 점수를 만듦.
		
		//0 ~ 100 사이의 난수 10개를 저장할 수 있는 배열 선언
		int[] array = new int[10];
		
		//배열에 난수 5개를 저장.
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(101);
		
		}
		/*민지가 한것
		  for (int i = 0; i < array.length; i++) {
		 
			int r = rand.nextInt(11);
			array[i] = r;
		*/
		//배열에 저장된 모든 점수를 한 줄에 출력.
			// 민지가 한것 -> System.out.print(array[i]+ " ");
			System.out.print("scores: ");
			for (int s :array) {
				System.out.print(s+ " ");
		}
		System.out.println();
		
		//총점을 계산하고 출력
		int sum = 0;
		for (int s : array) {
			sum += s;
		}
		System.out.println("총점 : "+sum );
		
		/*민지가 한것
		 int sum = 0;
		
		for (int i = 0; i <array.length; i++) {
			sum += array[i];
		}
		System.out.println();
		System.out.println("총점 = "+sum);
		*/
		//평균을 계산하고 출력
		
		double mean = (double)sum / array.length;
		System.out.println("평균 : " + mean);
		
		/*민지가 한것
		 double avr = 0; 
		avr = sum / 5.0;
		System.out.println("평균 = "+avr);
		*/
		
		//표준편차를 계산하고 출력 Math.sqrt(a)메서드를 이용 ->제곱근(squared root)
		//표준편차 (standard deviation) = sqrt(분산)
		//분산(deviation) = ((x_0 - mean)^2 + (x_1 - mean)^2 + ...) /(N-1) = 데이터들이 평균에서 떨어져 있는 정도.
		double sumOfSquares = 0.0;
		for (int s : array) {
			sumOfSquares += (s - mean) * (s - mean);
		}
		double deviation = sumOfSquares / array.length;
		double stdDev = Math.sqrt(deviation);
		System.out.println("표준편차 : " + stdDev);
		
		/*double d = Math.pow((array[i]-avr),2);
		double var += d;
		double std = d/(array.length-1.0);
		std = Math.sqrt(var);
		System.out.println(std);
		 */
		//최댓값을 찾아서 출력
		int max = array[0]; //배열의 첫번째 원소를 최댓값이라고 가정
		for (int i = 0; i <array.length; i++) {// 배열의 원소들을 모두 반복하면서
			if(max < array[i]) {// 배열에서 max보다 더 큰 값을 찾으면
				max = array[i];// max를 배열에서 찾은 값으로 바꿈.
			}
		}
		System.out.println("최대값 : "+ max);
		
		//최솟값을 찾아서 출력
		int min = array[0];// 최솟값을 배열의 첫번째 값이라고 가정
		for (int s : array) {//배열의 모든 원소들에 대해서 반복하면서
			if(min > s) {//배열에서 min보다 더 작은 값을 발견했다면
				min = s;// 더 작은 값으로 min을 변경
			}
		}
		System.out.println("최소값 : " + min);
		/*민지가 한것
		 for (int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("최소값 = " + min);
		*/

	}

}
