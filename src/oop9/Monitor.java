package oop9;

//인터페이스 --> 기획서
//모든 종류의 모니터가 반드시갖춰야하는 기능을 정의한다.
//모든 종류의 모니터에 대한 표준(사용방법표준)을 정한다.
public interface Monitor {
	
	public abstract void on();
	void off();					// public abstract는 생략가능
	void display();				// public abstract는 생략가능

}
