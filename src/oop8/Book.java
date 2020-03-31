package oop8;

import java.awt.image.TileObserver;

public class Book {
	
	private String title;
	private String writer;
	private int price;
	
	public Book() {}
	
	public String getTitle() {
		return title;
	}
	
	//멤버변수의 값을 변환하는 getter 메소드 정의
	public String getWriter() {
		return writer;
	}
	public int getprice() {
		return price;
	}
	
	// 멤버변수의 값을 변경하는  setter 메소드 정의
	public void setTitle(String title) {
		this.title = title;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setprice(int price) {
		this.price = price;
	}
}
