package edu.java.method05;

public class MethodMain05 {

	public static void main(String[] args) {
		//메서드 작성 연습
		int[] scores = {10, 20, 100, 90, 80, 100}; // 정수 5개를 저장하는 배열
		int total = sum(scores); // 정수 배열을 sum 메서드의 argument로 전달, 호출
		double mean = mean(scores);
		double stdDev = std(scores);
		int max = max(scores);
		int min = min(scores);
		System.out.println("총점: "+ total);
		System.out.println("평균: "+ mean);
		System.out.println("표준편차: "+ stdDev);
		System.out.println("최댓값: "+ max);
		System.out.println("최솟값: "+ min);
		
		

		//과제
		//평균 계산하는 메서드 호출, 그 결과 출력
		//표준편차 계산하는 메서드 호출, 그 결과 출력
		//최댓값 찾는 메서드 호출, 그 결과 출력
		//최솟값 찾는 메서드 호출, 그 결과 출력
		//모든 메서드의 파라미터 타입은 int[].
		
	}// end main()
	/**
	 * 정수들의 배열을 전달 받아서, 배열의 모든 원소들의 합을 반환하는 메서드.
	 * 
	 * @param numbers 정수(int)들의 배열.
	 * @return 배열의 모든 원소들의 합.
	 */
	public static int sum(int[] numbers) {
		int total = 0;
		for (int x : numbers) {
			total += x;
		}
		return total;
	}
	
	/**
	 * 정수들의 배열을 전달받아서, 그 배열의 모든 원소들의 평균을 반환하는 메서드.
	 * 
	 * @param scores 정수(int)들의 배열
	 * @return 배열의 원소들의 평균(double)
	 */
	public static double mean(int[] scores) {
		int total = 0;
		double mean = 0.0;
		
		for (int x : scores) {
			total += x;
		}
		
		mean = (double)total / scores.length;
		return mean;
	}
	
	/**
	 * 정수들의 배열을 전달받아서, 그 배열의 원소들의 표준편차를 반환하는 메서드.
	 * 
	 * @param scores 정수(int)들의 배열
	 * @return scores의 원소들의 표준편차(double)
	 */
	public static double std(int[] scores) {
		int total = 0;
		double mean = 0.0;
		
		for (int x : scores) {
			total += x;
		}
		
		mean = (double)total / scores.length;
		
		double sumOfSquares = 0.0;
		for(int s :scores) {
			sumOfSquares += (s - mean) * (s - mean);
		}
		double deviation = sumOfSquares / scores.length;
		double stdDev = Math.sqrt(deviation);
		return stdDev;
	}
	
	/**
	 * 정수들의 배열을 전달받아서 최댓값을 찾아서 반환하는 메서드.
	 * 
	 * @param scores 정수(int)들의 배열
	 * @return scores의 원소들 중 최댓값(int)
	 */
	public static int max(int[] scores) {
		int max = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}
		}
		return max;
	}
	
	/**
	 * 정수들의 배열에서 최솟값을 찾아서 반환하는 메서드.
	 * 
	 * @param scores 정수들의 배열(int[])
	 * @return 배열의 최솟값 - int
	 */
	public static int min(int[] scores) {
		int min = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if( min > scores[i]) {
				min = scores[i];
			}
		}
		return min;
	}
} //end class
