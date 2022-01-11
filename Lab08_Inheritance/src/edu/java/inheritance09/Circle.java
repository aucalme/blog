package edu.java.inheritance09;

public class Circle extends Shape {
	//field
	private double radius;
	
	//constructor
	public Circle(double radius) {
		super("동그라미");
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public double perimeter() {
		return  2 * Math.PI * radius;
	}
}
