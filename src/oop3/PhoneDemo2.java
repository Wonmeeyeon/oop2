package oop3;

import java.util.Scanner;

public class PhoneDemo2 {
	public static void main(String[] args) {
		
		// Iphone객체를 생성해서 Iphone객체의 모든 멤버를 사용하겠다.
		// Iphone p1 = new Iphone();
		// Galaxy객체를 생성해서 Galaxy객체의 모든 멤버를 사용하겠다.
		// Galaxy p2 = new Galaxy();
		
		//인터넷 기능이 지원되는 SmartPhone류 객체를
		// 생성해서 SmartPhone타입의 변수에 저장하고,
		// SmartPhone류들이 지원하는 멤버를 사용하겠다.
		// SmartPhone p1 = new SmartPhone();		p1.internet();
		// p1 = new Iphone();						p1.internet();
		// p1 = new Galaxy();						p1.internet();
		
		// 사진촬영 기능이 지원되는 폰류의 객체를 생성해서 사진촬영을 해보고,
		// 성능을 테스트해보자
		// FeaturePhone p1 = new FeaturePhone();    p1.photo();
		// p1 = new SmartPhone();					p1.photo();
		// p1 = new Iphone();						p1.photo();
		// p1 = new Galaxy();						p1.photo();
		
		// 애플뮤직기능을 사용하고 싶다. Iphone류 객체를 생성(구매)해야 한다. Iphone, Iphone8, IphoneX, Iphone11
		// 지문인식기능을 사용하고 싶다. Iphone8류 객체를 생성해야한다.		Iphone8
		// 얼굴인식기능을 사용하고 싶다. IphoneX류 객체를 생성해야한다.		IphoneX, Iphone11
		
		Scanner sc = new Scanner(System.in);
		
		SmartPhone testPhone = null;
		
		System.out.println("인터넷 기능을 테스트할 폰을 선택하세요. 테스트를 진행해드립니다.");
		System.out.println("1.그냥 스마트폰 2.아이폰 3.갤럭시");
		int no = sc.nextInt();
		
		if (no ==1 ) {
			System.out.println("그냥 스마트폰 객체를 생성해서 테스트를 진행합니다.");
			testPhone = new SmartPhone();
		}else if (no == 2) {
			System.out.println("아이폰 객체를 생성해서 테스트를 진행합니다.");
			testPhone = new Iphone();
		}else if (no == 3) {
			System.out.println("갤러시 객체를 생성해서 테스트를 진행합니다.");
			testPhone = new Galaxy();
		}
	
		if (testPhone != null) {
			testPhone.internet();
		}else {
			System.out.println("잘못된 번호를 입력하였습니다.");
		}
	
	
	}

}
