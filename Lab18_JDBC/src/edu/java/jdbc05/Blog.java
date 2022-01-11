package edu.java.jdbc05;

import java.util.Date;

// MVC(Model-View-Controller) 아키텍쳐에서 Model에 해당하는 클래스
public class Blog {
	// 멤버 변수
	private int blogNo; // blog_no 컬럼
	private String title; // title 컬럼
	private String content; // content 컬럼
	private Date updateTime; // update_time 컬럼

	// 생성자
	public Blog() {}
	public Blog(int blogNo, String title, String content, Date updateTime) {}
	
	// getters & setters
	
	// toString()
}
