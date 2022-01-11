package edu.java.class03;

public class Rectangle {
	// field - 속성, 데이터 
	double width; // 직사각형의 가로 길이
	double height; // 직사각형의 세로 길이
	// constructor(생성자)
	// 1) default constructor: width와 height를 모두 0.0으로 초기화
	public Rectangle() {}
	// 2) 파라미터가 1개인 생성자: width와 height를 같은 값으로 초기화
	public Rectangle(double width) {
		this.width = width;
		this.height = width;
	}
	// 3) 파라미터가 2개인 생성자: 첫번째 argument로 width를 초기화, 두번째 argument로 height를 초기화
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	// method - 기능
	// 1) 직사각형의 넓이를 리턴하는 메서드
	public double area() {
		double area = width * height;
		return area;
	}
	// 2) 직사각형의 둘레 길이를 리턴하는 메서드
	public double rectangleLength() {
		double rectangleLength = (width + height) * 2;
		return rectangleLength;
	}
}
