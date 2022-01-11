package edu.java.class04;

public class PointMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point pt1 = new Point();
		pt1.info(); // pt1의 정보를 출력
		pt1.Move(2, 3);//(0,0) -> (2,3) 이동
		pt1.info();// 이동 후 점의 좌표 출력
		
		System.out.println();
		Point pt2 = new Point(4,3);
		pt2.info();
		pt2.Move(2, 1).Move(0, 2); //메서드 연쇄 호출
		pt2.info();
	}

}
