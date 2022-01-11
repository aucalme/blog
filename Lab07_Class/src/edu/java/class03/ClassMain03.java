package edu.java.class03;

public class ClassMain03 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println("첫번째 가로길이: "+r1.width);
		System.out.println("첫번째 세로길이: "+r1.height);
		double a = r1.area();
		double r = r1.rectangleLength();
		System.out.println("첫번째 넓이: "+a);
		System.out.println("첫번째 둘레: "+r);
		
		System.out.println("---------------------");
		
		Rectangle r2 = new Rectangle(5.5);
		System.out.println("두번째 가로길이: "+r2.width);
		System.out.println("두번째 세로길이: "+r2.height);
		a = r2.area();
		r = r2.rectangleLength();
		System.out.println("두번째 넓이: "+a);
		System.out.println("두번째 둘레: "+r);
		
		System.out.println("---------------------");
		
		Rectangle r3 = new Rectangle(2.2,3.3);
		System.out.println("세번째 가로길이: "+r3.width);
		System.out.println("세번째 세로길이: "+r3.height);
		a = r3.area();
		r = r3.rectangleLength();
		System.out.println("세번째 넓이: "+a);
		System.out.println("세번째 둘레: "+r);
		
		System.out.println("---------------------");

	}

}
