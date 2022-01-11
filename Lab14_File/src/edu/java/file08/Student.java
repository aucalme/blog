package edu.java.file08;

import java.io.Serializable;

public class Student implements Serializable {
	// field
	private int id;
	private String name;
	private Score score;
	
	// constructor - 기본 생성자, 파라미터 3개(int, String, Score)를 갖는 생성자
	public Student () {}
	public Student (int id, String name, Score score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	// getters & setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	
	// toString 메서드 override
	@Override
	public String toString() {
		return "Student{id:" + this.id + ", name:" + this.name + ", score" + this.score + "}";
				
	}
	
}
