package edu.java.inheritance09;

public class Rectangle extends Shape {
	//field
	private double width;
	private double height;
	
	// constructor
	public Rectangle(double width, double height) {
		super("직사각형"); // 상위 클래스의 생성자를 "명시적"으로 호출
		this.width = width;
		this.height = height;
	}

	//상위 클래스 Shape이 가지고 있는 추상 메서드들을 override해서 구현(implement).
	//override: 덮어쓰는 것. 타입이름 변수이름 파라미터 다 동일해야 조건이 맞음.
	@Override
	public double area() {
		return width * height;
	}
	
	@Override
	public double perimeter() {
		return (width + height) * 2;
	}
}

