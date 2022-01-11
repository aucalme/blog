package edu.java.conditional03;

import java.util.Scanner;

public class ConditionalMain03 {

	public static void main(String[] args) {
		// 시험 합격/불합격 여부 출력
		// 시험 과목 (Java,SQL,JSP)의 점수를 정수로 입력받고 저장.
		//모든 과목의 점수가 40점 이상이고, 평균이 60점 이상이면 합격
		//그렇지 않으면 불합격을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Java 점수 입력>>>");
		int Java = sc.nextInt();
		
		System.out.println("SQL 점수 입력>>>");
		int SQL = sc.nextInt();
		
		System.out.println("JSP 점수 입력>>>");
		int JSP = sc.nextInt();
		sc.close();
		
		
		double mean =(Java+SQL+JSP)/3.0;
		
		if (Java >=40 && SQL>=40 && JSP>=40 && mean >=60 ) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		System.out.println("===end===");
	}

}
