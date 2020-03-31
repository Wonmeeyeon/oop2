package oop7.sub;

public class Modifier {
	
	private int a;			// private 접근제한
	int b;					// default 접근제한
	protected int c;		// protected 접근제한
	public int d;			// public 접근제한
	
	// 기본 생성자
	public Modifier() {}
	
	// 접근제한자
	//	클래스는 public 
	//	멤버변수는 private
	//	생성자는 public
	//	일반 멤버 메소드는 public
	//	클래스 내부적으로 사용되는 멤버메소드는 private
	
	// 클래서 변수(상수)는 public
	// 클래스 메소드는 public
}
