package edu.java.class05;

public class ClassMain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score s = new Score();
		System.out.println("총점: "+ s.getTotal());
		System.out.println("평균: "+ s.getAverage());
		
		Score s2 = new Score(100,50,55,99);
		System.out.println("총점: "+ s2.getTotal());
		System.out.println("평균: "+ s2.getAverage());
		
		System.out.println();
		
		Student st1 = new Student(1004, "오쌤", new Score(100,90,60,60));
		st1.info();
		
		
	}

}
