package oop3;

public class PhoneDemo {
	public static void main(String[] args) {
		
		// Iphone 객체는 Iphone 타입의 변수 및 Iphone조상 타입의 변수에 저장할 수 있다.
		Iphone p1 = new Iphone();
		SmartPhone p2 = new Iphone();
		FeaturePhone p3 = new Iphone();
		Phone p4 = new Iphone();
		
		// Iphone 객체는 Galaxy타입의 변수에 담을 수 없다.
		// Galaxy p5 = new Iphone();			//오류 오류 오류 오류!!!!!!!!!
		
		
		//							//클래스			사용가능 참조변수
		p1.userid = "hong";			//Iphone		p1
		p1.password = "ddfg22";		//Iphone		p1
		p1.applemusic();			//Iphone		p1
		p1.siri();					//Iphone		p1
		
		p1.ip = "192.154.15.123";		//SmartPhone	p1	p2
		p1.email = "hong@naver.com";	//SmartPhone	p1	p2
		p1.email();						//SmartPhone	p1	p2
		p1.internet();					//SmartPhone	p1	p2
		
		p1.pixel = "천만화소";				//featurePhone	p1	p2	p3
		p1.photo();						//featurePhone	p1	p2	p3
		
		p1.tel = "010-5555-6666";		//phone			p1	p2	p3	p4
		p1.call();						//phone			p1	p2	p3	p4
		p1.receive();					//phone			p1	p2	p3	p4
		
		// 클래스의 형 변환(참조변수 형변환)
		// 클래스 형변환은 상속관계에 있는 클래스에서만 가능하다.
		// 자동 형변환
		//  -자손타입의 객체는 그 객체의 클래스 타입 변수와 그 객체의 조상 클래스 타입 변수에 담을 수 있다.
		
		// 수동 형변환
		//	-자손타입의 객체를 생성해서 조상타입의 변수에 저장했을 때,
		//   특정 위치의 자손객체의 참조값을 획득해야 하는 경우
		//	 형변환 연산자를 이용해서 특정 자손객체의 참조값을 획득할 수 있다.
		//	조상타입 클래스 변수1 = new 자손클래스();
		//	자손클래스 변수2 = (자손 클래스) 변수1;
		// 예) SmartPhone p = new Iphone();
		//		// Iphone객체의 기능을 사용하고 싶다.
		//		Iphone p2 = (Iphone) p1;
		//		p2.siri();
		
		//		Iphone객체의 기능을 사용하고 싶다.
		//		((Iphone) p1).siri();
	}

}
